import java.awt.Color;
import java.awt.Graphics;

public class UserCar {
	
	public int velX, velY;
	
	public UserCar() {
		velX = 160;
		velY = 400;
	}

	public void drawUserCar(Graphics g) {
			int boxSize = 40;
			g.setColor(Color.red);
			g.fillRect(velX, velY, boxSize, boxSize + 20);
	}

	public void tick() {
		for (int i = 0;i<Game.cars2.size();i++) {
			if (Game.cars2.get(i).x==velX && Game.cars2.get(i).y - 60 < velY &&Game.cars2.get(i).y + 60 > velY) {

				Game.gameRunning = false;
			}
			if(Game.cars2.get(i).y == Game.HEIGHT - 40){
				Game.score += 1;
				if(Game.score %20 == 0){
					Game.speed -= 10;
				}
			}	
		}
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
