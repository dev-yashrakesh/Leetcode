package leetcode;

import binarytree.BinaryTreeNode;

public class ConstructBinaryTreeFromPreAndIn {

	
	 public TreeNode buildTree(int[] preorder, int[] inorder) {
	        return buildTreehelper(preorder,inorder,0,inorder.length-1,0,preorder.length-1);
	    }
	
	 public static TreeNode buildTreehelper(int[] preOrder, int[] inOrder,int preS,int PreE,int InS,int InE) {
			
			if(InS>InE) {
				return null;
			}
			
			int rootdata=preOrder[preS];
			TreeNode root=new TreeNode(rootdata);
			
			int rootIndex=-1;
			for(int i=InS;i<=InE;i++) {
				if(root.val==inOrder[i]) {
					rootIndex=i;
					break;
				}
			}
			
			int leftInS=InS;
			int leftInE=rootIndex-1;
			int leftPreS=preS+1;
			int leftPreE=leftInE-leftInS+leftPreS;

			int rightInS=rootIndex+1;
			int rightInE=InE;
			int rightPreS=leftPreE+1;
			int rightPreE=PreE;
			
			root.left=buildTreehelper(preOrder, inOrder, leftPreS, leftPreE, leftInS, leftInE);
			root.right=buildTreehelper(preOrder, inOrder, rightPreS, rightPreE, rightInS, rightInE);
			
			return root;
			
			}
}
