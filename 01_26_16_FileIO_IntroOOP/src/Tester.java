
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		//fileIO();
		
		OOPStuff();

	}

	private static void OOPStuff() {
		Car c1 = new Car();
		Car c2 = new Car();
		
		
		c1.color = Color.RED;
		c1.make = "Honda";
		c1.model = "Accord";
		c1.owner = "Tom Ryan";
		c1.year = 2015;
	
		c2.color = Color.BLACK;
		c2.make = "Datsun";
		c2.model = "310-Hatchback";
		c2.owner = "Bob Right";
		c2.year = 1982;
		
		System.out.println(c1);
		System.out.println(c2);
	}

	private static void fileIO() {
		//Scanner fileIn = new Scanner(new File())


		PrintWriter fileOut = null;
		Scanner fileIn = null;

		try {
			//Write data to a file
			fileOut=  new PrintWriter(new File("namesF.txt"));

			fileOut.println("Tom");
			fileOut.println("Ryan");
			fileOut.println("Sally");


			fileOut.close();
			fileOut = null;

			//Read data from a file
			fileIn = new Scanner(new File("namesF.txt"));
			while(fileIn.hasNextLine())
				System.out.println(fileIn.nextLine());

			fileIn.close();
			fileIn = null;
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}finally{
			if(fileOut != null)
				fileOut.close();
			if(fileIn != null)
				fileIn.close();
		}



	}

}
