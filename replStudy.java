package replitagain;

class replStudy {
	

	 public static void main(String[] args){
		  int[] nums1 = new int []  { 2,3,4};
	      
	      System.out.println(findMax(nums1);
	       System.out.println(findMax(new double []{ 2.1,3.1,4.1}));
	  
	  }
	  //WRITE YOUR CODE HERE
	  public int  findMAx(int [] nums){
	    int max = nums[0];
	    for(int each :nums){
	      if(each>max)
	      max = each;
	    }
	    return max;
	  }
	   public double findMAx(double [] nums){
	   double max = nums[0];
	    for(double each :nums){
	      if(each>max)
	    	  max =each;
	  }
	  return max;
	}
	
	

}
