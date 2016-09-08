import java.io.File;
import java.io.RandomAccessFile;
import java.util.Arrays;


public class Tester {

	public Tester() {

	}

	public static void main(String[] args) {

		/*		RandomAccessFile raf = null;

		try {

			raf = new RandomAccessFile(new File("testF.txt"), "rw");

			while(raf.getFilePointer() < raf.length()){
				System.out.println(raf.readChar());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try  { raf.close(); } catch(Exception e) {}

		}*/

		int[] nums = {1, 7, 8, 4, 2, 11};

		System.out.println(searchArray(nums, 2));
		Arrays.sort(nums);
		System.out.println(binarySearch(nums, 4));

	}

	public static int searchArray(int[] nums, int val){
		for(int i = 0; i < nums.length; i++)
			if(nums[i] == val) return i;
		return -1;


	}

	public static int binarySearch(int[] nums, int val){
		return binarySearch(nums, val, 0, nums.length - 1);
	}
	private static int binarySearch(int[] nums, int val, int lo, int hi){

			if(lo > hi) return -1;
			int mid = (lo + hi) / 2;
			if      (nums[mid] == val) return mid;
			if	    (nums[mid] < val) return binarySearch(nums, val, mid + 1, hi);
			return  binarySearch(nums, val, lo, mid + 1);
			
		
	}


}


