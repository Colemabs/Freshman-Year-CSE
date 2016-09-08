
public class Tester {

	public static void main(String[] args) {

//		 System.out.println(triangle(4));
//		 System.out.println(addDigit(4566));
//		 System.out.println(deDup("ABCCDEE"));
//		 System.out.println(extractNum("1AB2CD34"));
//		 System.out.println(val(""));
//		 System.out.println(sqrt(36));
//		 System.out.println(isSorted(new int[]{1, 4, 3, 3, 3}));
		 System.out.println(charCount("sdagggbbbbbbgg;bdg", 'b'));
	}

	
	public static int triangle(int rows){
		if(rows <= 0){
			return 0;
		}
		
		return triangle(rows - 1) + rows;
		
		//return (rows < 1) ? 0 : rows + triangle(rows - 1);
	}
	
	
	public static int addDigit(int num){
		
		if(num <= 0)
			return 0;
		
		return addDigit( num / 10 ) + num % 10;
		
	}

	public static String deDup(String s){
		
		if(s.length() < 2){
			return s;
		}
		
		 if (s.charAt(0) == s.charAt(1))
			 return deDup(s.substring(1));
		 return s.charAt(0) + deDup(s.substring(1));
		 
		// return (s.charAt(0) == s.charAt(1) ? "" : s.charAt(0)) + deDup(s.substring(1));
		
	}

	public static String extractNum(String s){
		
		if(s.length() == 0)
			return "";
		if(s.charAt(0) >= '0' && s.charAt(0) <= '9')
			return s.charAt(0) + extractNum(s.substring(1));
		return 					 extractNum(s.substring(1));
		
	}

	
	// Valuable method to have in a permanent library
	// A way to access the number at the beginning of an String and return as a number
	public static int val(String s){
		
		return Integer.parseInt("0" + val(s, true));
		
	}
	
	private static String val(String s, boolean tmp){
		
		if(s.length() == 0 || (s.charAt(0) < '0' || s.charAt(0) > '9') )
			return "";
		
		return s.charAt(0) - 48 + val(s.substring(1), tmp); 
		
	}

	public static double sqrt(double n){
		return sqrt(n, n/2);
	
	}
	
	private static double sqrt(double n, double guess){
		
		if( guess == (guess + (n / guess) ) / 2) return guess;
		
		return sqrt(n, (guess + (n/guess))/2);
		
		
	}

	public static boolean isSorted(int[] nums){
	
		return isSorted(nums, 0);
		
	}
	
	public static boolean isSorted(int[] nums, int index){
		//base cases: all the way through the list; not sorted
		if(index > nums.length - 2) return true;
		if(nums[index] > nums[index + 1]) return false;
		
		return isSorted(nums, index + 1);
	
			
		
		
	}

	public static int charCount(String s, char c){
		if(s.length() == 0) return 0;
		if(s.charAt(0) == c)
			return 1 + charCount(s.substring(1), c);
		return charCount(s.substring(1), c);
		
		
	}
}

