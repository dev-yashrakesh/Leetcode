package leetcode;

import java.util.List;

public class PostOrderBinaryTree {

public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        postorder(root,l);
        return l;
    }

public void postorder(TreeNode root,List<Integer> l) {
	if(root==null) {
		return;
	}
	postorder(root.left,l);
	postorder(root.right,l);
	l.add(root.val);
}
	
}
