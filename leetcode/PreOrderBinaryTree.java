package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PreOrderBinaryTree {

	
public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        preorder(root,l);
        return l;
    }

public void preorder(TreeNode root,List<Integer> l) {
	if(root==null) {
		return;
	}
	l.add(root.val);
	preorder(root.left,l);
	preorder(root.right,l);
}
	
}
