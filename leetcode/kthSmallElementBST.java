package leetcode;

public class kthSmallElementBST {

	public int kthSmallest(TreeNode root, int k) {
		List<Integer> ans=new ArrayList<>();
		inorder(root,ans);
		return (ans.get(k-1));
   }

private void inorder(TreeNode root,List<Integer> ans) {
	if(root==null) {
		return;
	}
	
	inorder(root.left,ans);
	ans.add(root.val);
	inorder(root.right,ans);
	
}
	
}
