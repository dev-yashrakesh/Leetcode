package leetcode;

public class ValidateBST {

public boolean isValidBST(TreeNode root) {
     
	return isValidBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	
    }
	

public boolean isValidBST(TreeNode root,int min,int max) {
	if(root==null) {
		return true;
	}
	
	if(root.data>=max||root.data<=min) {
		return false;
	}
	
	return isValidBST(root.left,min,root.data)&&isValidBST(root.right,root.data,max);
}

}
