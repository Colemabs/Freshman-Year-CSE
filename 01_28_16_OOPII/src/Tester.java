import java.awt.Color;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Tester {
	
	public static ArrayList<Student> students = new ArrayList<Student>();

	public static void main(String[] args) {
		
		
		Student s = new Student();
		s.age = 22;
		s.firstName = "Ben";
		s.lastName = "Coleman";
		s.gpa = 4.0;
		s.hairColor = Color.BLACK;
		s.isMale = true;
		s.test1 = 82;
		s.test2 = 86;
		s.test3 = 70;
		s.test4 = 86;
//		
		students.add(s);
//	
		saveStudents();
		
//		students.clear();
		
		loadStudents();
		
		printStudents("B");
	}

	private static void printStudents(String byLetterGrade) {
		for(Student s: students){
			if(s.getLetterGrade().equalsIgnoreCase(byLetterGrade));
			
			System.out.println(s);
		}
		
	}

	public static void saveStudents() {
		PrintWriter pw = null;
	
	try{
		pw = new PrintWriter(new File("students.txt"));
		
		for(Student s : students) {
			s.save(pw);
		}
		
		pw.close();
		
	} catch(Exception e) {
		System.out.println(e.getMessage());
	} finally {
		if(pw != null)pw.close();
	}
	}
	
	public static void loadStudents() {
		//Loading students into a database
				Student s;
				Scanner fin = null;
				try {
				
					fin = new Scanner(new File("students.txt"));
					
					while(fin.hasNextLine()) {
						s = new Student();
						s.load(fin);
						students.add(s);
						
					}
					
					fin.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				} finally{
					if(fin != null) fin.close();
				}
			}
	
	}
	

