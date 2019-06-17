package replitagain;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbbccc";
		String newstr ="";
		 for(int i = 0; i<str.length() ;i++) {
			  String each = ""+str.charAt(i);
			  
			  if(!newstr.contains(each)) {
					newstr+=each;
				}
		 }
		
		System.out.println(newstr);
		
}
}