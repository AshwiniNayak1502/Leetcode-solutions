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
    public static boolean check(TreeNode root,int curSum,int target){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            if((curSum+root.val)==target){
                return true;
            }
        }
        curSum+=root.val;
        return check(root.left,curSum,target)||check(root.right,curSum,target);

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(check(root,0,targetSum)){
            return true;
        }
        return false;
    }
}
