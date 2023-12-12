package leetcode;

public class FindFirstAndLastPositionOfElment {

public int[] searchRange(int[] nums, int target) {
  int first=-1,last=-1;
  for(int i=0;i<nums.length;i++) {
	  if(nums[i]==target) {
		  if(first==-1) {
			  first=i;
		  }
		  last=i;
	  }
  }
  int ans[]= {first,last};
  return ans;
    }
	
	public static void main(String[] args) {
		

	}

}
