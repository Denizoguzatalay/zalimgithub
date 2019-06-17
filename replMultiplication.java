package replitagain;

import java.util.Arrays;

public class replMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] multiplicationTable = new int[10][10];
		//Arrays.fill(multiplicationTable, 1);
	    //TODO: type your code below
	    for(int row = 0 ; row<10 ; row++){
	      for(int col = 0 ; col<10 ; col++){
	       multiplicationTable[row][col]=(row+1)*(col+1);
	      }
	    }
	    
	    //Do not modify below line it will be used to test your code. And 
	    //Can be used by you while developing your code
	    System.out.println(Arrays.deepToString(multiplicationTable) ) ;
	}

}
