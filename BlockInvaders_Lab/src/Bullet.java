import java.awt.Graphics;
import java.util.ArrayList;


public class Bullet extends MovingObject{

	private int  height, width, speed, xPos, yPos;
	
	
	private ArrayList<Bullet> bullets = new ArrayList<Bullet>();
	
	public Bullet(int xSpeed, int ySpeed, int height, int width, int xPos, int yPos) {
		super(xSpeed, ySpeed);
		this.height = height;
		this.width = width;
		this.speed = speed;
		this.xPos = xPos;
		this.yPos = yPos;
	}


	/////////////////////////////////////////
	@Override
	public void draw(Graphics g) {
		g.drawRect(height, speed, width, height);
		
	}


	//////////////////////////////////////////

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


	public int getXPos() {
		return xPos;
	}


	public void setXPos(int xPos) {
		this.xPos = xPos;
	}


	public int getYPos() {
		return yPos;
	}


	public void setYPos(int yPos) {
		this.yPos = yPos;
	}


}
