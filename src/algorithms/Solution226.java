package algorithms;
/*
 * 226. Invert Binary Tree
 */
public class Solution226 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }else{
            TreeNode left=invertTree(root.left);
            TreeNode right=invertTree(root.right);
            root.left=right;
            root.right=left;
            return root;
        }
    }
}
