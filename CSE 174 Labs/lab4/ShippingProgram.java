// Ben Coleman
// CSE 174 H
// September 25, 2015

import java.util.Scanner;

public class TitleGoesHere {
  
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    //Obtains and stores length width and height
    System.out.printf("Enter length, width, and height in inches: ");
    double length = keyboard.nextDouble();
    double width = keyboard.nextDouble();
    double height = keyboard.nextDouble();
    
    // Calculates and stores volume in a variable
    double volume = length * width * height;
    System.out.printf("Volume: %.1f cubic inches\n", volume);
    
    double shippingCost;
    
    // Checks to see if volume is less than 300
    if (volume < 300) {
      System.out.printf("Do you want to ship first class?\n");
      String decision = keyboard.next();
      
      if(decision.equals("y")) {
        shippingCost = ((.08 * volume) + 1.0);
      }
      else {// if user doesn't want first class
        shippingCost = (.01 * volume); 
      }   
    }
    else {// volume is greater than or equal to 300
      if (volume < 600) {
        shippingCost = ((.08 * volume) + 1.0);
      }
      else {// volumes in this are greater or equal to 600
        shippingCost = (35.0);
      }
      
    }
    System.out.printf("Shipping cost: $%.2f\n", shippingCost);
  }
  
}
