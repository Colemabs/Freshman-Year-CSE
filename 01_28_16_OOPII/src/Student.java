import java.awt.Color;
import java.io.PrintWriter;
import java.util.Scanner;


public class Student {
	
	public String firstName, lastName;
	public int age, studentYear;
	public double gpa, test1, test2 , test3 ,test4;
	public boolean isMale;
	public Color hairColor;

	
	public void save(PrintWriter pw) throws Exception{
		
		pw.println(firstName);
		pw.println(lastName);
		pw.println(age);
		pw.println(studentYear);
		pw.println(gpa);
		pw.println(test1);
		pw.println(test2);
		pw.println(test3);
		pw.println(test4);
		pw.println(isMale);
		pw.println(hairColor.getRGB());
	}
	
	public void load(Scanner fin) throws Exception{
		firstName = fin.nextLine();
		lastName = fin.nextLine();
		age = Integer.parseInt( fin.nextLine() );
		studentYear = Integer.parseInt( fin.nextLine() );
		gpa = Double.parseDouble( fin.nextLine() );
		test1 = Double.parseDouble( fin.nextLine() );
		test2 = Double.parseDouble( fin.nextLine() );
		test3 = Double.parseDouble( fin.nextLine() );
		test4 = Double.parseDouble( fin.nextLine() );
		isMale = Boolean.parseBoolean( fin.nextLine() );
		hairColor = new Color( Integer.parseInt( fin.nextLine() ));
	}
	
	
	public double getAverage() {
			return (test1 + test2 + test3 + test4) / 4.0;
	}
	
	public String getLetterGrade() {
		
		double average = getAverage();
		
		if(average >= 90)
			return "A";
		if(average >= 80)
			return "B";
		if(average >= 70)
			return "C";
		if(average >= 60)
			return "D";
		return "F";
	}
	
	public double getBestTest() {
		return Math.max(Math.max(Math.max(test1,test2), test3), test4);
	}
	
	/*
	public String getStudentYear() {
		int year = studentYear;
		
		if(year == 1) return "First-Year";
		if(year == 2) return "Sophomore";
		if(year == 3) return "Junior";
		if(year == 4) return "Senior";
		
		return year;
		
	}
	*/
	
	
	@Override
	public String toString() {
		return String.format("%10s, %-10s [%s] %5.1f %s Highest Grade: %5.1f", 
								lastName, firstName, (isMale ? "M" : "F"), 
								getAverage(), getLetterGrade(), getBestTest()
							);
		
	}
}

