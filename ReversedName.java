package replitagain;

import java.util.Arrays;
import java.util.Scanner;

public class ReversedName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		Scanner scan = new Scanner(System.in);
//	    int size = scan.nextInt();
//	    int[] nums = new int[size];
//			for(int i =0; i < size; i++) {
//				nums[i] = scan.nextInt();
//			}
//			
//			
//			int [] num1 = new int [nums.length*2];
//			 num1[num1.length-1] = nums[nums.length-1];
//			 
//			 System.out.println(Arrays.toString(num1));
//		
//		
		
		 Scanner input = new Scanner(System.in);
		    int[] inhabitants = new int[8];
		    for(int i=0; i<inhabitants.length; i++) {
		      inhabitants[i] = input.nextInt();
		    }
		    
		    //TODO. Write you code below this line. 
		    int day = 0;
		    int sumarray = 0;
		    int[] temp = new int[8];
		    System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
		    while(true){
		      for (int i = 1; i < inhabitants.length-2; i++) {
		    	  if(inhabitants[i-1]==0) {
			    	  temp[i] = inhabitants[i] / 2; 
		    	  }
		    	  else if(inhabitants[i+1]==0) {
						temp[i] = inhabitants[i] / 2;
		    	  }
		    	  else{
		    		    temp[i] = inhabitants[i];
		    	  }
					}
		 
		      if(inhabitants[0]==0) {
		    	  temp[1]=inhabitants[1] / 2;
		      }
		      if(inhabitants[inhabitants.length-1]==0) {
		    	  temp[inhabitants.length-2] = inhabitants[inhabitants.length-2] / 2;
		      }
		      for (int j = 0; j < inhabitants.length; j++) {
		    	  inhabitants[j]=temp[j];
		    	  sumarray+=inhabitants[j];
		      }
		      day++;
		      System.out.println("Day " + day + " " + Arrays.toString(inhabitants));	
		      if(sumarray==0) {
		    	  break;
		      }
		      sumarray=0;
			      
		    }     
			System.out.println("---- EXTINCT ----");	
			
			
		
	}

}
