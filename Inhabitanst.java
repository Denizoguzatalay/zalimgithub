package replitagain;

import java.util.Arrays;
import java.util.Scanner;

public class Inhabitanst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	   // int num = 0;
	    //TODO: write your code below
	    int count = 0;
	    Arrays.sort(nums);
	    for(int num:nums) {
	    	//System.out.print(num);
	    }
	    
	    for(int i =0  ; i<nums.length-1; i+=2) {
	      if(nums[i]==nums[i+1]) {
	        count++;
	         
	      }
	      if (count!=0)
	       System.out.println(nums[i]);
	      
	    }
	    count = 0;
	}

}
