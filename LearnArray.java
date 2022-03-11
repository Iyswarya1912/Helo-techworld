package Week1.day2.assignments;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {10,20,30,70,85,38,40};
		System.out.println(values.length);
		System.out.println(values[values.length-1]);
		
		  Arrays.sort(values);
		  
			/*
			 * for(int i=0;i<values.length;i++) { System.out.println(values[i]); }
			 * System.out.println("***************");
			 * 
			 * 
			 * for(int i=values.length-1; i>=0;i--) { System.out.println(values[i]); }
			 */
		  int valueof2ndhighest = values.length-2;
		  System.out.println(values[valueof2ndhighest]);
		  
		  System.out.println("2ndsmallestvalue:"+ values[1]);
}
}