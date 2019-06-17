package replitagain;

import java.util.ArrayList;
import java.util.Arrays;

public class hello {

	public static boolean isAnagram(String word1, String word2) {     
		   
		word1 = word1.toLowerCase().replace(" ", "");
	    word2 = word2.toLowerCase().replace(" ", "");
	     boolean bool =true;
	    for(int i =0 ;i<word1.length();i++){
	       for(int j =0 ;j<word2.length();j++){
	         
	         if(word1.length()!=word2.length()){
	           bool=false;
	         }else if(word1.charAt(i)!=word2.charAt(j)) {
	        	 bool =false;
	         }else {
	        	 bool = true;
	         }
	       }
	    }
	    return bool;
	}
	public static void main(String[] args) {
		
		System.out.println(isAnagram("listen", "Silent"));
	}
	
}
