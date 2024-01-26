package leetcode;

public class BalancedBinaryTree {

	
	public int height(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        
        return 1+Math.max(leftHeight, rightHeight);
	}	
	
public boolean isBalanced(TreeNode root) {
        if(root==null) {
        	return true;
        }
        
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        
        if(Math.abs(rightHeight-leftHeight)>1) {
        	return false;
        }
        
        boolean leftBalance=isBalanced(root.left);
        boolean rightBalance=isBalanced(root.right);
        
        return leftBalance && rightBalance;
    }
	
	
}
