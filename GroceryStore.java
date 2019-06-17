package replitagain;

import java.util.Arrays;

public class GroceryStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Task num 5    
	    // create a string called groceries 
	    // add items separated by comma 
	    // split them and print them out 
	    /// find out size of split 
	    /// find out length of each items 
		
		//Create a string using concat
		//Find sizes of grocery items
		String groceries = "Tomatoes- bananas- " + " strawberries- cucumbers -" + "tulips and iceCream" +  " kiwis- mangos";
		
		// split them and print them out 
		String[] item = groceries.split("-");
		System.out.println(Arrays.toString(item));
		
		/// find out size of split 
		System.out.println(item.length); // length is split +1
		
		
		/// find out length of each items 
		for ( int i = 0 ;  i < item.length; i++) {
			   int length = item[i].length();// loop statement
			   
			   //System.out.println(item[i].trim()+" has "+ length+ " letters"); // it prints all iteration
			   
		}
		
		item[0] = "tomatoes";
		System.out.println(item[4]);
		String []a = item[4].split("and");//tulips and iceCream kiwis
		System.out.println(Arrays.toString(a));
		
	}

}
