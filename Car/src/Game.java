import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("serial")
public class Game extends Canvas implements Runnable {
	public static final int ROWS = 25;
	public static final int COLS = 18;
	public static final int SIZE = 20;
	public static final int WIDTH = COLS * SIZE;
	public static final int HEIGHT = ROWS * SIZE;
	public static int speed = 30;
	public static List<Cars> cars2 = new ArrayList<Cars>();
	public static UserCar userCar;
	public static Cars cars;
	int timer = 0;
	public static int speedTimer = 16;
	public static  int score;

	private Thread runThread;
	private Graphics globalGraphics;

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
		score = 0;
	}

	public void run() {
		while (gameRunning) {
			render(globalGraphics);
			userCar.tick();

			if(timer>speedTimer){
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
		endGame(globalGraphics);
	}

	public void render(Graphics g) {
		g.clearRect(0, 0, WIDTH, HEIGHT);
		userCar.drawUserCar(g);
		
		for (int i = 0;i<cars2.size();i++) {
			cars2.get(i).drawCars(g);
			
		}
		drawScore(globalGraphics);
	}
	public void drawScore(Graphics g){
		g.setColor(Color.darkGray);
		g.fillRect(0, Game.HEIGHT - 40, Game.WIDTH, 40);
		g.setColor(Color.white);
		g.drawString("score=" + score, 10, Game.WIDTH + 120);
	}
	
	private void endGame(Graphics g){
		g.setFont(new Font("TimesRoman", Font.BOLD, 40));
		g.setColor(Color.red);
		g.drawString("R.I.P.", Game.WIDTH/2-50, Game.HEIGHT/2);
	}
}

