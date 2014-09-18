import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputHandler implements KeyListener {

	public InputHandler(Game game) {
		game.addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		// right x = 1, y = 0
		if (keyCode == KeyEvent.VK_RIGHT && Game.userCar.velX <= 240) {
			Game.userCar.velX += 55;
		}
		// left x = -1, y = 0
		else if (keyCode == KeyEvent.VK_LEFT && Game.userCar.velX >= 95) {
			Game.userCar.velX -= 55;
		}
		if (keyCode == KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	

	}

	@Override
	public void keyTyped(KeyEvent e) {
		

	}

}
