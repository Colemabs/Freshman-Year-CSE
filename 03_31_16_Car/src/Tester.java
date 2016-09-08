import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;


public class Tester {

	static ArrayList<Point> points = new ArrayList<Point>();
	
		public static void main(String[] args){
			Random rnd = new Random(3);
			
			for(int i = 0; i < 4; i++){
				
			points.add(new Point(rnd.nextInt(100) + 1, rnd.nextInt(100) + 1));
			
			}
			
			System.out.println("Before...");
			for(Point p : points){
				System.out.println(p);
			}
			
			//Write the code that removes the odd sum of x and y
			for(int i = points.size() - 1; i >= 0; i--){
				
				if(   (points.get(i).x + points.get(i).y) % 2 == 1)
					points.remove(points.get(i));

			}
			
			
			System.out.println("\nAfter...");
			for(Point p : points){
				System.out.println(p);
			}
		}
	

}
