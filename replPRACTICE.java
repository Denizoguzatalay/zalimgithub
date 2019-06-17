package replitagain;

import java.util.Arrays;
import java.util.Scanner;

public class replPRACTICE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner scan = new Scanner(System.in);
			int sizeInner = scan.nextInt();
			int sizeOuter = scan.nextInt();
			int[] inner = new int[sizeInner];
			int[] outer = new int[sizeOuter];
			for(int i =0; i < sizeInner; i++) {
				inner[i] = scan.nextInt();
			}
			for(int j =0; j < sizeOuter; j++) {
				outer[j] = scan.nextInt();
			}
			Arrays.sort(inner);
			Arrays.sort(outer);
			//WRITE YOUR CODE HERE
			int count = 0;
			
			for(int y = 0 ; y<inner.length-2 ; y++){
				  for(int x = 0 ; x<outer.length ; x++){
					  if((outer.length>inner.length)&&(inner[y]==outer[x])&& (inner[y]!=inner[y+1]&&inner[y+1]!=inner[y+2])){
						  for(int i = 0 ; i<inner.length ; i++){
							  for(int j = 0 ; j<outer.length ; j++){
								  if((inner[i]==outer[j])){
									     count++;
							  }
							 }
						  }
					   }
				  	}
				}
				  
				  
			boolean equal = true;
			if(count==inner.length){
			  System.out.println(equal);
			}else{
			  System.out.println(!equal);
			}
			
	}

}
