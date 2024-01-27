package leetcode;

import java.util.List;

public class InorderBinaryTree {

	
	 public List<Integer> inorderTraversal(TreeNode root) {
	        List<Integer> l=new ArrayList<>();
	        inorder(root,l);
	        return l;
	    }
	 
	 public void inorder(TreeNode root,List<Integer> l) {
		 if(root==null) {
			 return;
		 }
		 
		 inorder(root.left,l);
		 l.add(root.val);
		 inorder(root.right,l);
	 }
	
}
