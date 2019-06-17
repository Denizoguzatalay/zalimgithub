package replitagain;

import java.util.Arrays;
import java.util.Scanner;

public class repl_111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		 int newInhabitant = 0;
	        int[] inhabitants = new int[8];
	        int[] extinct = { 0, 0, 0, 0, 0, 0, 0, 0 };
	        for (int i = 0; i < inhabitants.length; i++) {
	            inhabitants[i] = input.nextInt();
	        }
	        int day = 0;
	        System.out.print("Day " + day + " ");
	        System.out.println(Arrays.toString(inhabitants));
	        for (int j = 0; j < inhabitants.length; j++) {  //bir array aldik
	            for (int i = 0; i < inhabitants.length; i++) {  // //aldigimiz arayin tum rakamlarini  ikiye bolduk
	                    inhabitants[i] /= 2;
	            }
	            day++;
	            System.out.print("Day " + day + " ");
	            System.out.println(Arrays.toString(inhabitants));
	            if (Arrays.equals(inhabitants, extinct))   //hepsi sifir oldugu an icerdeki looptan cik.
	                break;
	        }
	System.out.println("---- EXTINCT ----");	
			
			
			
	}

}
