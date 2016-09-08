/**
 * A program that displays a set of points on the screen.
 * Begin with an array of Point objects.  Send that array
 * to a PointDisplay object.  The PointDisplay object will
 * handle all the necessary drawing for you.
 *
 * @author Norm Krumpe
 * @version 2.0
 */
import javax.swing.JFrame;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PointPlotter  {
  public static void main(String[] args)throws FileNotFoundException {
    // For now, how JFrames work is unimportant. Our
    // focus is on using a PointDisplay object,
    // which requires an array of Point objects in order
    // to work.
    JFrame frame = new JFrame("Show Some Points");
    frame.setBounds(300, 300, 615, 650);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // PointDisplay objects "consume" arrays of Point objects.
    // In other words, if you have an array of Point objects,
    // and pass that array to PointDisplay, it will draw
    // those points for you.
    boolean connect = false;
    int pointDiameter = 10;
    
    ArrayList<Point> myPoints = data3List();
    
    
    
    
    // DON'T CHANGE THE REST OF THE CODE IN THIS METHOD:
    PointDisplay display = new PointDisplay(myPoints,
                                            pointDiameter, connect);
    frame.add(display);
    frame.setVisible(true);
    
  }
  
  // Returns an array list of 3 points.  Just so you can
  // see how a method can return array lists:
  
  public static ArrayList<Point> easyList(){
    ArrayList<Point> listResult = new ArrayList<Point>();
    listResult.add(new Point(300,300));
                   
                   listResult.add(new Point(400, 400));
                                  return listResult;
                                  
                                  }
  
  public static Point[] easyArray() {  
    Point[] result = new Point[50];
    
    int xCoordinate;
    int yCoordinate;
    
    for(int i = 0; i < 50; i++){
      xCoordinate = (int)(Math.random()*600);
      yCoordinate = (int)(Math.random() * 600);
      
      result[i] = new Point(xCoordinate, yCoordinate);
    }
    
    return result;
  }
  
  public static Point[] triangleArray() {
    Point[] triangle = new Point[5000];
    
    int xCoor;
    int yCoor;
    
    for(int i = 0; i < 5000; i++){
      xCoor = (int)(Math.random() * 600);
      yCoor = (int)(Math.random() * xCoor);
      triangle[i] = new Point(xCoor, yCoor);
    }
    return triangle;
  }
  
  public static ArrayList<Point> data1List()throws FileNotFoundException{
    Scanner fileIn = new Scanner(new File("data1.pts"));
    
    ArrayList<Point> data1ListPoints = new ArrayList<Point>();
    
    while(fileIn.hasNextInt()){
      data1ListPoints.add(new Point(fileIn.nextInt(), fileIn.nextInt()));
      
    }
    fileIn.close();
    return data1ListPoints;
  }
  
  public static ArrayList<Point> data2List()throws FileNotFoundException{
    Scanner fileIn = new Scanner(new File("data2.pts"));
    
    ArrayList<Point> data2ListPoints = new ArrayList<Point>();
    
    while(fileIn.hasNext()){
      if(fileIn.next().equals("BAD")){
        fileIn.nextInt();
        fileIn.nextInt();
    }
      else 
      data2ListPoints.add(new Point(fileIn.nextInt(), fileIn.nextInt()));
      }
    
  
    fileIn.close();
    return data2ListPoints;
  }
  
  public static ArrayList<Point> data3List()throws FileNotFoundException{
    Scanner fileIn = new Scanner(new File("data3.pts"));
    
    ArrayList<Point> data3ListPoints = new ArrayList<Point>();
    
    while(fileIn.hasNext()){
      int x = fileIn.nextInt();
      int y = fileIn.nextInt();
      if(x >= 0 && x <= 600 && y>= 0 && y <= 600)
        data3ListPoints.add(new Point(x, y));
      
  }
  return data3ListPoints;
  }
  }
