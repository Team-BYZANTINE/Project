import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class Cars {
	public int carX, carY;

	public static Random randGenerator = new Random();
	private Car nextCar;
	public int time;
	int boxSize = 20;
	int x = randGenerator.nextInt(5);
	int y = 0;
	
	public Cars() {
		nextCar = createCars(Game.cars);
	}
	
	public Car createCars(Cars c) {


		switch (x) {
		case 0:
			x = 0;
			break;
		case 1:
			x = 20;
			break;
		case 2:
			x = 40;
			break;
		case 3:
			x = 60;
			break;
		case 4:
			x = 80;
		case 5:
			x = 10;
		case 6:
			x = 120;
			break;
		case 7:
			x = 140;
			break;
		case 8:
			x = 160;
		case 9:
			x = 180;
		case 10:
			x = 200;
		case 11:
			x = 220;
		case 12:
			x = 240;
		case 13:
			x = 260;
			break;
		}
		Car b = new Car(x, y);
		
		
			return b;
		
	}
	public void update(){
		y+=1;
	}

	public void drawCars(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, boxSize, boxSize + 10);
		//System.out.println();
	}
	public Car getNewCar(){
		
			
			
		
		return nextCar;
	}
}
