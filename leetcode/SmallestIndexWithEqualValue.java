package leetcode;

public class SmallestIndexWithEqualValue {

public int smallestEqual(int[] nums) {
        for(int i=0;i<nums.length;i++) {
        	if(i%10==nums[i]) {
        		return i;
        	}
        }
        return -1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
