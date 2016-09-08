import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;




public class Block extends MovingObject {

	public static int screenWidth = 600;
	
	private int height, width, speed;
	
	private ArrayList<Block> blocks = new ArrayList<Block>();
	
	//////////////////////////////////////////
	public Block(int xSpeed, int ySpeed, int height, int width) {
		super(xSpeed, ySpeed);
		this.height = height;
		this.width = width;
	}

	
///////////////////////////////////////////Methods
	public void draw(Graphics g) {
		g.drawRect(x, y, width, height);
		for(Block b : blocks)
			b.draw(g);
	}

	/////////////////////////////////////////
	public double getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}





}
