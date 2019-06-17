package replitagain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class deneme2 {

	

	 public static void main(String[] args) {
		    Scanner s = new Scanner(System.in);
		    System.out.print("#1: ");
		    int num1 = s.nextInt();
		    System.out.print("#2: ");
		    int num2 = s.nextInt();
		    //start on line 11
		    
		    if (num1 % 2 == 0) {
		        num1++;
		    }
		    
		    for (int i = num1; i <= num2; i+=2) {
		    	 System.out.println(i+" ");
		    }		    
		    
		   
		    
		    
		    
		    
//		    int i =num1;
//		    while(i<=num2){
//		      if(num1%2==1&&num2==1) {
//		       System.out.print(i+" ");
//		       i+=2;
//		      }else if(num1%2==0&&num2==1) {
//		    	   System.out.print(i+1+" ");
//		       i+=2;
//		      }	   
//		  }
//		    
//		      int j=num1;
//		      while(i<num2){
//			      if(num1%2==0&&num2==0) {
//			       System.out.print(i+1+" ");
//			       i+=2;
//		      }else if(num1%2==1&&num2==0) {
//		    	   System.out.print(i+" ");
//		         i+=2;
//			  }
//		
//		     }
	
	 }
}
