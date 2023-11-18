package leetcode;

public class PartitionArrayToGivenPivot {

public static int[] pivotArray(int[] nums, int pivot) {

	int ans[]=new int[nums.length];
	int j=0;
	for(int i=0;i<nums.length;i++) {
		if(nums[i]<pivot) {
			ans[j]=nums[i];
			j++;
		}
	}	
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==pivot) {
				ans[j]=nums[i];
				j++;
			}
		}		
			for(int i=0;i<nums.length;i++) {
				if(nums[i]>pivot) {
					ans[j]=nums[i];
					j++;
				}
	}
	
	return ans;
    }

	
	public static void main(String[] args) {
		int ans[]= {9,12,5,10,14,3,10};
		int s[]=pivotArray(ans,10);
		for(int i=0;i<ans.length;i++) {
			System.out.println(s[i]);
		}

	}

}
