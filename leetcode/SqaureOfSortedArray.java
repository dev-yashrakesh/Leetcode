package leetcode;

public class SqaureOfSortedArray {

public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++) {
        	arr[i]=nums[i]*nums[i];
        }
        for(int i=0;i<arr.length-1;i++) {
        	for(int j=i+1;j<arr.length;j++) {
        	if(arr[i]>=arr[j]) {
        		int temp=arr[i];
        		arr[i]=arr[j];
        		arr[j]=temp;
        	}
        }
        }
        return arr;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
