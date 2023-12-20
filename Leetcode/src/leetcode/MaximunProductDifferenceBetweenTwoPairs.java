package leetcode;

import java.util.Arrays;

public class MaximunProductDifferenceBetweenTwoPairs {

public int maxProductDifference(int[] nums) {
	Arrays.sort(nums);
    int start=0;
    int end=nums.length-1;
	
    int ans=(nums[end]*nums[end-1])-(nums[start]*nums[start+1]);
    return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
