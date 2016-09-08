import java.util.ArrayList;
import java.util.Collections;



public class CarTester {

	public static void main(String[] args) {
		ArrayList<Car> cars = new ArrayList<Car>();
		
		
		cars.add(new Car("Honda", "Accord",2012, "Tom Ryan", Car.Direction.NORTH, 10, 10, 100, 50) );
		cars.add(new Car("Ford", "Escape",2010, "Ben Arthur", Car.Direction.EAST, 10, 10, 100, 50) );
		cars.add(new Car("Honda", "Pilot",2000, "Sally Shmally", Car.Direction.SOUTH, 10, 10, 100, 50) );
		cars.add(new Car("Honda", "Pilot",1999, "Sally Shmally", Car.Direction.SOUTH, 10, 10, 100, 50) );
		
		Car.sortBy = Car.SortBy.MAKE_MODEL_YEAR;
		
		Collections.sort(cars);
		
		System.out.println(cars);
	
	
	}

}
