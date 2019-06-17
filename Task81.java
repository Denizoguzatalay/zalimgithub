package replitagain;

import java.util.Arrays;
import java.util.Scanner;

public class Task81 {
	 public static void main(String[] args) {
	
		 System.out.println( mergeStrings("java", "selenium"));
		 
		
			 	 
		  }
	 
	 public static String mergeStrings(String one, String two) {
		 String str = "";
		  
		      if(one.length()==two.length()) {
		    	  for(int i = 0; i< one.length() ; i++){
		    		str += ""+one.charAt(i)+two.charAt(i); 
		    	  }
		      }else if(one.length()>two.length()) {
		    	  for(int i = 0; i< two.length() ; i++){
		    		  str += ""+one.charAt(i)+two.charAt(i); 
		      }
		    	  str =str + one.substring(two.length());
		    	  
		      }else if(one.length()<two.length()) {
		    	  for(int i = 0; i< one.length() ; i++){
		    		  str += ""+one.charAt(i)+two.charAt(i); 
		      }
		    	  str =str + two.substring(one.length());
	         }
		  return str;
  }
}