import java.awt.Color;


public class Car {
	
	public String owner, make, model;
	public int year;
	public Color color;
	
	
	
	@Override
	public String toString() {
		return "Car [owner=" + owner + ", make=" + make + ", model=" + model
				+ ", year=" + year + ", color=" + color + "]";
	}
	
}
