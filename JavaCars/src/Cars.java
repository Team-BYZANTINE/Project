import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;


public class Cars {
	public int carX, carY;
	
	private Random randGenerator;
	private Box carBox;
	
	public void createCars(Cars c){
		carY = 0;
		
		randGenerator = new Random();
		int rndX = randGenerator.nextInt(5);
		int y = 0;
		switch (rndX) {
		case 0: carX = 20;
		break;
		case 1: carX = 40;
		break;
		case 2: carX = 60;
		break;
		case 3: carX = 80;
		break;
		case 4: carX = 100;
		break;
		}
	}
	
	public void drawCars(Graphics g){
		int boxSize = 20;
		g.setColor(Color.green);
		g.fillRect(carX, carY, boxSize, boxSize + 10);
		carY++;
	}
}
