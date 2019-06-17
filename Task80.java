package replitagain;

import java.util.Arrays;
import java.util.Scanner;

public class Task80 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();
		    String[] splitted = str.split(", ");
		    
		    
		    int shortest = splitted[0].length();
		    String str1="";
		 
		       for(int i = 1 ;i<splitted.length ; i++){
		       
		         if(splitted[i].length()<=shortest){
		           shortest = splitted[i].length();
		         }
		       } 
		       
		       for(String each: splitted){
		         if(each.length()==shortest){
		           str1+=each+",";
		         }
		       }
		         
		       
		       //System.out.println(str1);
		      String [] split1 = str1.trim().split(",");
		      Arrays.sort(split1);
		      System.out.println(Arrays.toString(split1));
		    
		    
		
	}

}
