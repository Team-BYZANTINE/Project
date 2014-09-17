import java.awt.Color;
import java.awt.Graphics;

public class UserCar {
	
	public int velX, velY;
	
	public UserCar() {
		velX = 20;
		velY = 200;
	}

	public void drawUserCar(Graphics g) {
			int boxSize = 20;
			g.setColor(Color.red);
			g.fillRect(velX, velY, boxSize, boxSize + 10);
	}

	public void tick() {
		for (int i = 0;i<Game.cars2.size();i++) {
			if (Game.cars2.get(i).x==velX && Game.cars2.get(i).y-30<=velY &&Game.cars2.get(i).y + 30 >=velY ) {
				System.out.println("TEST");
			}
			
		}
		//Game.userCar = new UserCar();
		
		//Game.gameRunning = false;
	}

	public int getVelX() {
		return velX;
	}

	public void setVelX(int velX) {
		this.velX = velX;
	}

	public int getVelY() {
		return velY;
	}

	public void setVelY(int velY) {
		this.velY = velY;
	}

}
