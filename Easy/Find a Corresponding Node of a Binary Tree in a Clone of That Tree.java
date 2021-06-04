/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    private TreeNode temp;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
     
        
        if(cloned.left != null){
            temp =  getTargetCopy(original,cloned.left,target);
        }
        if(cloned.val == target.val){
            return cloned;
        }
        if(cloned.right != null){
            temp =  getTargetCopy(original,cloned.right,target);
        }
        
        return temp;
    }
}
