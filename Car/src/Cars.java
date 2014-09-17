import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Cars {
	public int carX, carY;

	public static Random randGenerator = new Random();
	private Car nextCar;
	public int time;
	int boxSize = 40;
	int x = randGenerator.nextInt(5);
	int y = 0;
	
	public Cars() {
		nextCar = createCars(Game.cars);
	}
	
	public Car createCars(Cars c) {


		switch (x) {
		case 0:
			x = 70;
			break;
		case 1:
			x = 115;
			break;
		case 2:
			x = 160;
			break;
		case 3:
			x = 205;
			break;
		case 4:
			x = 250;
			break;
		}
		Car b = new Car(x, y);
		
			return b;
	}
	
	public void update(){
		y+=4;
	}

	public void drawCars(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(x, y, boxSize, boxSize + 20);
	}
	
	public Car getNewCar(){
		return nextCar;
	}
}
