import java.awt.Image;
import java.awt.Rectangle;


public class Fighter extends Rectangle{

	private int height, width, ammo, xPos,yPos;
	

	private boolean fire, canFire;
	private Image image;
	
	//////////////////////////////////////
	public Fighter(String imageFile, int ammo, int xPos, int yPos, int height, int width, boolean fire, boolean canFire) {
		this.image = image;
		this.ammo = ammo;
		this.xPos = xPos;
		this.yPos = yPos;
		this.height = height;
		this.width = width;
		this.fire = fire;
		this.canFire = canFire;
	}


	////////////////////////////////////////
	public int getAmmo() {
		return ammo;
	}


	public void setAmmo(int ammo) {
		this.ammo = ammo;
	}


	public int getxPos() {
		return xPos;
	}


	public void setxPos(int xPos) {
		this.xPos = xPos;
	}


	public int getyPos() {
		return yPos;
	}


	public void setyPos(int yPos) {
		this.yPos = yPos;
	}


	public boolean isFire() {
		return fire;
	}


	public void setFire(boolean fire) {
		this.fire = fire;
	}


	public boolean isCanFire() {
		return canFire;
	}


	public void setCanFire(boolean canFire) {
		this.canFire = canFire;
	}


	public Image getImage() {
		return image;
	}


	public void setImage(Image image) {
		this.image = image;
	}


	public double getHeight() {
		return (double)height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public double getWidth() {
		return (double)width;
	}


	public void setWidth(int width) {
		this.width = width;
	}

}
