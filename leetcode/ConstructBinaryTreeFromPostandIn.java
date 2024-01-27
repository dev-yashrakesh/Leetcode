package leetcode;

public class ConstructBinaryTreeFromPostandIn {

public TreeNode buildTree(int[] inorder, int[] postorder) {
    return buildTreeHelper(inorder,postorder,0,inorder.length-1,0,postorder.length-1); 
	
    }

public TreeNode buildTreeHelper(int[] inorder, int[] postorder,int InS,int InE,int PostS,int PostE) {
	if(InS>InE) {
		return null;
	}
	int rootdata=postorder[PostE];
	TreeNode root=new TreeNode(rootdata);
	
	int rootIndex=-1;
	for(int i=InS;i<=InE;i++) {
		if(root.val==inorder[i]) {
			rootIndex=i;
			break;
		}
	}
	
	int leftInS=InS;
	int leftInE=rootIndex-1;
	int leftPostS=PostS;
	int leftPostE=leftInE-leftInS+leftPostS;
	
	int rightInS=rootIndex+1;
	int rightInE=InE;
	int rightPostS=leftPostE+1;
	int rightPostE=PostE-1;
	
	root.left=buildTreeHelper(inorder, postorder, leftInS, leftInE, leftPostS, leftPostE);
	root.right=buildTreeHelper(inorder, postorder, rightInS, rightInE, rightPostS, rightPostE);
	return root;
	
	
}
	
}
