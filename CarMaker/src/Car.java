/*Ben Coleman
 * CSE 271
 * Quiz 1
 */

import java.awt.Color;


public class Car {

	private static String make, model, year, type, format, overviewDescription, plate;		
	private static Color color;
	private static int numOfDoors, numOfSeats, customerReviewCount, inventory;
	private static double weight, cost, reviewRating;
	
	
	


//====================================================================Constructors

public Car(){
	this("","", "", Color.BLACK, 0, "","","");
}

public Car(String make, String model, String year, Color color, int numOfDoors, String type,
		String format, String overviewDescription){
	this(make, model, year, color, numOfDoors, type, format, overviewDescription,
			"XXXXXXX", 0 , 0.0, 0.0, 0, 0.0, 00);
}

public Car(String make, String model, String year, Color color, int numOfDoors, String type,
		String format, String overviewDescription, String plate, int numOfSeats, double weight,
		double cost, int customerReviewCount, double reviewRating, int inventory){
	super();
	setMake(make);
	setModel(model);
	setYear(year);
	setColor(color);
	setNumOfDoors(numOfDoors);
	setType(type);
	setFormat(format);
	setOverviewDescription(overviewDescription);
	setPlate(plate);
	setNumOfSeats(numOfSeats);
	setWeight(weight);
	setCost(cost);
	setCustomerReviewCount(customerReviewCount);
	setReviewRating(customerReviewCount);
	setInventory(inventory);
}

@Override
public String toString() {
	return "Car [make=" + make + ", year=" + year + ", format=" + format + ", color=" + color
			+ ", Review Rating= " + reviewRating +"/10]";
}

//=====================================================================Getters/Setters
public static String getMake() {
	return make;
}

public static void setMake(String make) {
	Car.make = make;
}

public static String getModel() {
	return model;
}

public static void setModel(String model) {
	Car.model = model;
}

public static String getYear() {
	return year;
}

public static void setYear(String year) {
	Car.year = year;
}

public static String getType() {
	return type;
}

public static void setType(String type) {
	Car.type = type;
}

public static String getFormat() {
	return format;
}

public static void setFormat(String format) {
	Car.format = format;
}

public static String getOverviewDescription() {
	return overviewDescription;
}

public static void setOverviewDescription(String overviewDescription) {
	Car.overviewDescription = overviewDescription;
}

public static String getPlate() {
	return plate;
}

public static void setPlate(String plate) {
	Car.plate = plate;
}

public static Color getColor() {
	return color;
}

public static void setColor(Color color) {
	Car.color = color;
}

public static int getNumOfDoors() {
	return numOfDoors;
}

public static void setNumOfDoors(int numOfDoors) {
	Car.numOfDoors = numOfDoors;
}

public static int getNumOfSeats() {
	return numOfSeats;
}

public static void setNumOfSeats(int numOfSeats) {
	Car.numOfSeats = numOfSeats;
}

public static int getCustomerReviewCount() {
	return customerReviewCount;
}

public static void setCustomerReviewCount(int customerReviewCount) {
	Car.customerReviewCount = customerReviewCount;
}

public static int getInventory() {
	return inventory;
}

public static void setInventory(int inventory) {
	Car.inventory = inventory;
}

public static double getWeight() {
	return weight;
}

public static void setWeight(double weight) {
	Car.weight = weight;
}

public static double getCost() {
	return cost;
}

public static void setCost(double cost) {
	Car.cost = cost;
}

public static double getReviewRating() {
	return reviewRating;
}

public static void setReviewRating(double reviewRating) {
	Car.reviewRating = reviewRating;
}

}