package leetcode;

public class MonotonicArray {

	 public static boolean isMonotonic(int[] nums) {
		 int n=nums.length-1;
		 boolean greater=false,lesser=false;
	       for(int i=0;i<n;i++) {
	    	   int d=nums[i+1]-nums[i];
	    	   if(d>0) {
	    		   greater=true;
	    	   }
	    	   else if(d<0) {
	    		   lesser=true;
	    	   }
	    	   if(greater&&lesser) {
	    		   return false;
	    	   }
	       }
	       return true;
	    }
	
	public static void main(String[] args) {
		int[] n1= {1,2,3,4,5,6};
		boolean ans=isMonotonic(n1);
		System.out.println(ans);
	}

}
