package replitagain;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//charArray,charArray count, char to string, string to char, split,
		
	
		String charArray = "Cybertek";
		System.out.println(charArray.length());// 5 characters
		char [] arr = charArray.toCharArray(); //returns to char
		System.out.println(Arrays.toString(arr));//
		System.out.println(arr.length);// 5 elements
////////////////////////////////////////////////////////////////
		 arr = charArray.toCharArray(); //returns to char
		String str="";
		//char[] mychar = {'a', 'b', 'c'}; //abc
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];//concat
			str=str+c; //
		}
		
		System.out.println(str);
////////////////////////////////////////////////////////////////////////		
		//Split method is in  array class
		String kitchenItems = "knife, wooden, spoons, plates, cups, forks, dishwasher";
		System.out.println(kitchenItems.length());
		String[] split = kitchenItems.split(" "); //split is an array
		System.out.println(Arrays.toString(split));// makes to print easier and neater
		System.out.println(split.length);
////////////////////////////////////////////////////////////////////////////////////		
		
		
		
		
		
		

	}

}
