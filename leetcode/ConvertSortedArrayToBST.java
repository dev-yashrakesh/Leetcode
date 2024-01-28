package leetcode;

public class ConvertSortedArrayToBST {

public TreeNode sortedArrayToBST(int[] nums) {
        
	return sortedArrayToBST(nums,0,nums.length-1);
	
    }

public TreeNode sortedArrayToBST(int[] nums,int si ,int end) {
	if(si>end) {
		return null;
	}
	
	int mid=(si+end)/2;
	
	TreeNode root= new TreeNode(nums[mid]);
	root.left=sortedArrayToBST(nums,si,mid-1);
	root.right=sortedArrayToBST(nums,mid+1,end);
	
	return root;
}
	
}
