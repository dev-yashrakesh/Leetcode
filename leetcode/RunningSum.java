package leetcode;

public class RunningSum {

public static int[] runningSum(int[] nums) {
        
	int [] ans=new int[nums.length+1];
	for(int i=0;i<nums.length;i++) {
		int sum=0;
		for(int j=0;j<=i;j++) {
			sum=sum+nums[j];
			ans[j]=sum;
		}
	}
	return ans;
    }
	
	public static void main(String[] args) {
		int[] n1= {1,1,1,1,1};
		int[] ans=runningSum(n1);
		for(int i=0;i<n1.length;i++) {
			System.out.println(ans[i]);
		}

	}

}
