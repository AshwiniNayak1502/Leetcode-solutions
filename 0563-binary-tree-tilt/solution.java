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
    public static int countSum(TreeNode root){
        if(root==null){
            return 0;
        }
        return root.val+countSum(root.left)+countSum(root.right);
        
    }
    public static int tilt(TreeNode root){
        if(root==null)
            return 0;

       int leftSum=countSum(root.left);
       int rightSum=countSum(root.right);

       int curtilt=Math.abs(leftSum-rightSum);
       return curtilt+tilt(root.left)+tilt(root.right);
    }
    public int findTilt(TreeNode root) {
        return tilt(root);
        
    }
}
