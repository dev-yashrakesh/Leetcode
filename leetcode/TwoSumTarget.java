package leetcode;

public class TwoSumTarget {

public static int[] twoSum(int[] nums, int target) {
	

       for(int i=0;i<nums.length;i++) {
    	   for(int j=i+1;j<nums.length;j++) {
    		   if(nums[i]+nums[j]==target) {
    			   int arr[]=new int[] {i,j};
    			   System.out.println(arr[0]+" "+arr[1]);
    			   return arr;
    		   }
    		  
    	   } 
    	   
       }
     return null;  
    }
	
	public static void main(String[] args) {
		int[] arr= {2,7,11,15};
		 twoSum(arr,9);
		 

	}

}
