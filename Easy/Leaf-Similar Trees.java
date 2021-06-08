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
    // boolean flag = true;
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> arr1 = new ArrayList();
        List<Integer> arr2 = new ArrayList();
        
        leafValues(root1,arr1);
        leafValues(root2,arr2);
        
        return arr1.equals(arr2);
    }
    
    public void leafValues(TreeNode root,List<Integer> leafValuesArr){
        if(root == null){
            return;
        }
        leafValues(root.left,leafValuesArr);
        if(root.left == null && root.right == null){
            leafValuesArr.add(root.val);
        }
        leafValues(root.right,leafValuesArr);
    }
}
