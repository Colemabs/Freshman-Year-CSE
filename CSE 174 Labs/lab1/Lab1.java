public class Lab1
// Ben Coleman
// August 28th, 2015
// This program prints a design with my name and course name within it.
{ //This method prints a box with my name and course within it.
  public static void nameBox() { 
    System.out.println("***********");
    System.out.println("*   CSE   *");
    System.out.println("*   174   *");
    System.out.println("*   Ben   *");
    System.out.println("* Coleman *");
    System.out.println("***********");
  } 
  // This method prints a triangle of astericks above the nameBox.
  public static void topPart() {
    System.out.println("     *     ");
    System.out.println("    ***    ");
    System.out.println("   *****   ");
    System.out.println("  *******  ");
    System.out.println(" ********* ");
    System.out.println("***********");
  }
  // This method prints a triangle of astericks below the nameBox.
  public static void bottomPart() {
    System.out.println("***********");
    System.out.println(" ********* ");
    System.out.println("  *******  ");
    System.out.println("   *****   ");
    System.out.println("    ***    ");
    System.out.println("     *     ");
  }
    // This is the main method that calls all the minor functions, this creates the actual design.
    public static void main(String[] args) {
      topPart();
      nameBox();
      bottomPart();
   }
}