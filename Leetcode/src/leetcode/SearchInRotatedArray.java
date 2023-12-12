package leetcode;

public class SearchInRotatedArray {

	 public static int search(int[] nums, int target) {

		 int i=0;
	        while(i<nums.length) {
	        	if(nums[i]==target) {
	        		return i;
	        	}
	        	else {
	        		i++;
	        	}
	        }
	        return -1;
	    }
	
	public static void main(String[] args) {
		int arr[]= {1,3};
		int ans=search(arr,3);
		System.out.println(ans);

	}

}
