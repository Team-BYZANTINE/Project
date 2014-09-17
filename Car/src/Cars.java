import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Cars {
	public int carX, carY;

	public static Random randGenerator = new Random();
	private Car nextCar;
	public int time;
	int boxSize = 20;
	int rand = randGenerator.nextInt(15);
	int x = 0;
	int y = 0;
	
	public Cars() {
		nextCar = createCars(Game.cars);
	}
	
	public Car createCars(Cars c) {
		x = rand * 20;
		Car b = new Car(x, y);
		return b;
	}
	
	public void update(){
		y+=1;
	}

	public void drawCars(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y, boxSize, boxSize + 10);
		//System.out.println();
	}
	
	public Car getNewCar(){
		return nextCar;
	}
}
