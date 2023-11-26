package leetcode;

public class SearchInRotatedArray2 {

public boolean search(int[] nums, int target) {
        int n=nums.length;
        int i=0;
        while(i<n) {
        	if(nums[i]==target) {
        		return true;
        	}
        	else {
        		i++;
        	}
        }
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
