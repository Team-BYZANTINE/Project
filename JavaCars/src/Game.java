import java.awt.Canvas;
import java.awt.Graphics;

public class Game extends Canvas implements Runnable{
	public static final int ROWS = 30;
	public static final int COLS = 30;
	public static final int SIZE = 20;
	public static final int WIDTH = COLS*SIZE;
	public static final int HEIGHT = ROWS*SIZE;
	
	public static UserCar userCar;
	public static Cars cars;
	
	private Thread runThread;
	private Graphics globalGraphics;
	
	static boolean gameRunning = false;
	
	public void paint(Graphics g){
		globalGraphics = g.create();
		
		if (runThread == null) {
			runThread = new Thread(this);
			runThread.start();
			gameRunning = true;
		}
	}
	
	public Game() {
		userCar = new UserCar();
		cars = new Cars();
	}

	public void run(){
		while (gameRunning) {
			userCar.tick();
			render(globalGraphics);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public void render(Graphics g){
		g.clearRect(0, 0, WIDTH, HEIGHT);
		userCar.drawUserCar(g);
		cars.drawCars(g);

	}
}
