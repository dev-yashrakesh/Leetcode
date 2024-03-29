package leetcode;

public class MaximumDepthOfBinaryTree {

	public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int ht=0;
        int leftHeight=maxDepth(root.left);
        int rightHeight=maxDepth(root.right);
        return 1+Math.max(leftHeight,rightHeight);
    }
	
}
