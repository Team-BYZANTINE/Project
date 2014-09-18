import java.awt.Color;
import java.awt.Graphics;


public class Lanes {
	public int laneX, laneY;
	private Lane nextLane;
	int y = 0;
	
	public Lanes() {
		nextLane = createLanes(Game.lanes);
	}
	
	public Lane createLanes(Lanes l){
		Lane k = new Lane(92, y);
		
		return k;
	}
	
	public void update(){
		y+=6;
	}

	public void drawLanes(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(92, y, 11, 50);
		g.fillRect(147, y, 11, 50);
		g.fillRect(202, y, 11, 50);
		g.fillRect(257, y, 11, 50);
	}
	
	public Lane getNewLane(){
		return nextLane;
	}
	
}
