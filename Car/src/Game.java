import java.awt.Canvas;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("serial")
public class Game extends Canvas implements Runnable {
	public static final int ROWS = 25;
	public static final int COLS = 25;
	public static final int SIZE = 20;
	public static final int WIDTH = COLS * SIZE;
	public static final int HEIGHT = ROWS * SIZE;
	public static int speed = 50;
	public static List<Cars> cars2 = new ArrayList<Cars>();
	public static UserCar userCar;
	public static Cars cars;
	int timer = 0;

	private Thread runThread;
	private Graphics globalGraphics;
	private String b;

	static boolean gameRunning = false;

	public void paint(Graphics g) {
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

	public void run() {
		while (gameRunning) {
			render(globalGraphics);
			userCar.tick();
			if(timer>30){
				cars2.add(new Cars());
				timer=0;
			}
			for (int i = 0;i<cars2.size();i++) {
				cars2.get(i).update();
				
			}
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			timer++;
		}
	}

	public void render(Graphics g) {
		g.clearRect(0, 0, WIDTH, HEIGHT);
		userCar.drawUserCar(g);
		
		//cars.drawCars(g);
		for (int i = 0;i<cars2.size();i++) {
			cars2.get(i).drawCars(g);
			
		}
		}
	}

