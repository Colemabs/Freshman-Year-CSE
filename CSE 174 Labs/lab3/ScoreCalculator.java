// Ben Coleman
// CSE 174- H
// September 11, 2015

import java.util.Scanner;

//This program will compute the user's initials, avarage, minimum, maximum, and median.
public class ScoreCalculator {

  public static void main(String[] args) {
    //Declaring variables
    double averageScore, minimumScore, medianScore, maximumScore;
    String firstName, lastName;
    char firstInitial, lastInitial;
    Scanner keyboard = new Scanner(System.in);
    double score1, score2, score3;
    
    // Asking the name and storing that name in variables
    System.out.print("Enter your first and last name:");
    firstName = keyboard.next();
    lastName = keyboard.next();
    
    // Asks test scores and stores them in variables
    System.out.print("Enter your three test scores: ");
    score1 = keyboard.nextDouble();
    score2 = keyboard.nextDouble();
    score3 = keyboard.nextDouble();
    
    // Computes and stores the minimum test score value
    minimumScore = Math.min(score1, Math.min(score2, score3));
   
    // Computues and stores  the maximum test score value
    maximumScore = Math.max(score1, Math.max(score2, score3));
    
    //Computes and stores the average score
    averageScore = (score1+ score2 + score3)/3.0;
    
    // Computes and stores the median
    medianScore = (score1+score2+score3)-maximumScore - minimumScore;
    
    //Computes and stores first & last initials
    firstInitial = firstName.charAt(0);
    lastInitial = lastName.charAt(0);
    
    // Prints average score
    System.out.printf(firstInitial + "." + lastInitial + ".'s average is %.4f.\n", averageScore);
    
    // Prints minimum score
    System.out.printf(firstInitial + "." + lastInitial + ".'s minimum is %.1f.\n", minimumScore);
    
    //Prints median 
    System.out.printf(firstInitial + "." + lastInitial + ".'s median is %.1f.\n", medianScore);
    
    //Prints maximum score
    System.out.printf(firstInitial + "." + lastInitial + ".'s maximum is %.1f.\n", maximumScore);
  }
}