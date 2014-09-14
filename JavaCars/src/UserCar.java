import java.awt.Color;
import java.awt.Graphics;

public class UserCar {
	
	public int velX, velY;
	
	public UserCar() {
		velX = 25;
		velY = 200;
	}

	public void drawUserCar(Graphics g) {
			int boxSize = 20;
			g.setColor(Color.red);
			g.fillRect(velX, velY, boxSize, boxSize + 10);
	}

	public void tick() {
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
