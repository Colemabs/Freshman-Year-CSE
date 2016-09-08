import java.awt.Graphics;
import java.awt.Rectangle;


public abstract class MovingObject extends Rectangle{

	private int xSpeed, ySpeed;
	
	

	public MovingObject(int xSpeed, int ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
//////////////////////////////////////////
	public void move(){
		x += xSpeed;
		y += ySpeed;
	}
	
	public abstract void draw(Graphics g);
	
	////////////////////////////////////
	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

}
