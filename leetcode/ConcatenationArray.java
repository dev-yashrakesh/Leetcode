package leetcode;

public class ConcatenationArray {

public int[] getConcatenation(int[] nums) {
        int arr[]=new int[nums.length+nums.length];

        for(int i=0;i<nums.length;i++) {
        	arr[i]=nums[i];
        	arr[nums.length+i]=nums[i];
        }
        return nums;
       
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
