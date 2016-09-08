import java.awt.Rectangle;


public class Car extends Rectangle implements Comparable<Car>{

	public enum Direction{
		NORTH,
		SOUTH,
		EAST,
		WEST;
	}

	public enum SortBy {
		NONE,
		OWNER,
		YEAR,
		MAKE_MODEL,
		MAKE_MODEL_YEAR;
		
	}
	
	public static SortBy sortBy = SortBy.NONE;
	
	private String make, model, ownerName;
	private int year;
	private Direction direction;

	////////////////////////////////////////////Constructor
	public Car(String make, String model, int year){
		this(make, model, year, "");
	}

	public Car(String make, String model, int year, String ownerName){
		this(make, model, year, ownerName, Direction.NORTH, 0, 0, 0, 0);
	}
	
	public Car(String make, String model, int year, String ownerName, 
				Direction direction, int x, int y, int width, int height){
		super(x, y, width, height);
		setMake(make);
		setModel(model);
		setYear(year);
		setOwnerName(ownerName);
		setDirection(direction);
	}
	
	public Car(Car car){
		this(car.getMake(), car.getModel(), car.getYear(), car.getOwnerName(), car.getDirection(),
		car.x, car.y, car.width, car.height);
	}
	
	/////////////////////////////////////////////Methods
	public Car clone(){
		return new Car(this);
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == this) return true;
		
		if( !(obj instanceof Car)) return false;
		
		Car c = (Car)obj;
		
//		private String make, model, ownerName;
//		private int year;
//		private Direction direction;

		return 	make.equals(c.make) &&
				model.equals(c.model) &&
				ownerName.equals(c.ownerName) &&
				direction.equals(c.direction) &&
				year == c.year &&
				super.equals(c);
	}
	
	@Override
	public int compareTo(Car o) {
		
		if(sortBy == SortBy.OWNER){
			return ownerName.compareTo(o.ownerName);
		}
		else if(sortBy == SortBy.YEAR){
			return ownerName.compareTo(o.ownerName);
		}
		else if(sortBy == SortBy.MAKE_MODEL){
			return( (make + "_" + model).compareTo(o.make + "_" + o.model));
		}
		else if(sortBy == SortBy.MAKE_MODEL_YEAR){
			return( (make + "_" + model + "_" + year).compareTo(o.make + "_" + o.model + "_" + o.year));
		}
		else
			return 0;
		
	}

	
	

	////////////////////////////////////////////getters/setters

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", ownerName="
				+ ownerName + ", year=" + year + ", direction=" + direction
				+ "]\n";
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}




}
