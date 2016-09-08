package static_getset_constructors;

import java.awt.Color;
import java.util.ArrayList;

public class Tester {

	public static ArrayList<Ball> balls = new ArrayList<Ball>();
	
	public static void main(String[] args) {
		
		/*There are three main constructors in the Point class:
		 * empty Point();
		 * copy Point(p1);
		 * workhorse Point(5, 6);
		 */
		
		Ball b = new Ball(10, 20, 5, 5, 2, Color.RED, true);
		balls.add(b);
		
		Ball b2 = new Ball(67, 44, 5, 1, 1, Color.BLUE, false);
		balls.add(b2);
		
		Ball.setSw(500);//static means it has to be class-level
		Ball.setSh(500);//usually used for constants
		
		for(Ball ball: balls){
			System.out.println(ball);
		}
		
	System.out.println(b.getSize()+","+b2.getSize());
	//this prints the size for b2 because of class-level variables 
	//after we took away static for all the variables, it will print properly
	}
	}


