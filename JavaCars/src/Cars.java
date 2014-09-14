import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Cars {
	public int carX, carY;

	private Random randGenerator;
	private Car nextCar;

	public Cars() {
		nextCar = createCars(Game.cars);
	}
	
	public Car createCars(Cars c) {
		randGenerator = new Random();

		int x = randGenerator.nextInt(5);
		int y = 0;

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
			break;
		}
		
		Car b = new Car(x, y);
		
		return b;
		
		//ArrayList<Car> carArray = new ArrayList<Car>();
		//carArray.add(carX, carY);
	}

	public void drawCars(Graphics g) {
		int boxSize = 20;
		g.setColor(Color.green);
		g.fillRect(nextCar.x, nextCar.y, boxSize, boxSize + 10);
	}
	public Car getNewCar(){
		return nextCar;
	}
}
