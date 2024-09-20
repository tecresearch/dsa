package ds.util.algorithm.trees;

public interface TreeOperations {
	TreeNode createBst();
	TreeNode insert(TreeNode root,int element);
	TreeNode deleteNodeNoChild(TreeNode root,int element);
	TreeNode deleteNodeOneChild(TreeNode root,int element);
	TreeNode deleteNodeBothChild(TreeNode root,int element);
	void preOrder(TreeNode root);
	void inOrder(TreeNode root);
	void postOrder(TreeNode root);
	boolean search(TreeNode root,int element);
}
