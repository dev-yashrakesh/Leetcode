package leetcode;

public class DiameterOfBinaryTree {

//public int height(TreeNode root) {
//	if(root==null) {
//		return 0;
//	}
//	
//	int leftHeight=height(root.left);
//	int rightHeight=height(root.right);
//	
//	return 1+Math.max(leftHeight, rightHeight);
//}
//	
//public int diameterOfBinaryTree(TreeNode root) {
//        if(root==null) {
//        	return 0;
//        }
//        
//        int opt1=height(root.left)+height(root.right);
//        int opt2=diameterOfBinaryTree(root.left);
//        int opt3=diameterOfBinaryTree(root.right);
//        
//        return Math.max(opt1, Math.max(opt2, opt3));
//    }
	
	
	
	
	int ans=0;
	
	public int diameterOfBinaryTree(TreeNode root) {
		dfs(root);
		return ans;
	}
	
	public int dfs(TreeNode root) {
		if(root==null) {
			return 0;
		}
		
		int left=dfs(root.right);
		int right=dfs(root.left);
		
		ans=Math.max(left+right, ans);
		
		return 1+Math.max(left, right);
	}
}




