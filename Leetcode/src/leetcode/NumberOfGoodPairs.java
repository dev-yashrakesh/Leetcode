package leetcode;

public class NumberOfGoodPairs {

public static int numIdenticalPairs(int[] nums) {
	int count=0;
	 for(int i=0;i<nums.length-1;i++) {
		 int j=i+1;
		 while(j<nums.length) {
			 if(nums[i]==nums[j]) {
				 count++;
			 }
			 j++;
		 }
	 }
        return count;
    }
	
	public static void main(String[] args) {
		int[] n1= {1,2,3,1,1,3};
		System.out.println(numIdenticalPairs(n1));

	}

}
