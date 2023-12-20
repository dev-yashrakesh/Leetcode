package leetcode;

public class SingleNumber {

	public int singleNumber(int[] nums) {
		int m=nums.length;
		for(int i=0;i<m;i++) {
	        int count = 0;
			for(int j=0;j<m;j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
			}
			if(count==1) {
				return nums[i];
			}
			
		}
	     return -1;
	     
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
