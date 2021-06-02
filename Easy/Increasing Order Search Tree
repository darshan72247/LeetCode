/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private TreeNode temp = new TreeNode(100);
    private TreeNode ans = temp;
    public TreeNode increasingBST(TreeNode root) {
        
        if(root == null){
            return root;
        }
        if(root.left != null){
            increasingBST(root.left);
        }
        // Inorder travesal
        temp.right = new TreeNode(root.val);
        temp = temp.right;
        
        if(root.right != null){
            increasingBST(root.right);
        }
        return ans.right;
    }
}
