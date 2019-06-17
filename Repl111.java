package replitagain;

import java.util.Arrays;
import java.util.Scanner;

public class Repl111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.
//		//
////				Example:
//		//
////				nums -> [1, 1, 2, 3, 4, 3, 4]
////				         2
				
//      Given a String variable sentence, write code to type each word in separate lines.
//
//      Example:
//      sentence -> "Java is fun"
//      Print
//      Java
//      is
//      fun
        
        Scanner input = new Scanner(System.in);
        
        String sentence = input.nextLine(); 
        
        String [] splitted = sentence.split(" ");
        //System.out.println(splitted.length);
        System.out.println(splitted[0]);
        System.out.println(splitted[1]);
        System.out.println(splitted[2]);
        
        
        
			 
	}

		
}
