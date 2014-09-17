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
		if (keyCode == KeyEvent.VK_RIGHT) {
			if (Game.userCar.velX <= 205) {
				Game.userCar.velX += 45;
			}
		}
		// left x = -1, y = 0
		else if (keyCode == KeyEvent.VK_LEFT) {
			if (Game.userCar.velX >= 95) {
				Game.userCar.velX -= 45;
			}
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
