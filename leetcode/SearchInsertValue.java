package leetcode;

public class SearchInsertValue {

public static int searchInsert(int[] nums, int target) {
	int start=0;
	int end=nums.length;
       while(start<=end) {
    	   int mid=(start+end)/2;
    	   if(nums[mid]==target) {
    		   return mid;
    	   }
    	   else if(target>nums[mid]) {
    		   start=mid+1;
    	   }
    	   else {
    		   end=mid-1;
    	   }
       }
       return start;
    }
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int ans=searchInsert(arr,4);

	}

}
