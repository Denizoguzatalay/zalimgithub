package replitagain;

import java.util.ArrayList;

public class hello1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2){
		  ArrayList<String> listnew  = new ArrayList<>(wordList1);
		  for(int i= 0 ;i<wordList2.size();i++){
		      listnew.add(wordList2.get(i));
		      i--;
		  }
		   return listnew;
		  
		}

}
