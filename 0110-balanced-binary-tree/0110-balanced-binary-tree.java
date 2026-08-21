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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int l=getheight(root.left);
        int r=getheight(root.right);
        if(Math.abs(l-r)<=1&&(isBalanced(root.left)&&(isBalanced(root.right)))){
            return true;
        }
        return false;
    }
    public int getheight(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=getheight(root.left);
        int r=getheight(root.right);
        return Math.max(l,r)+1;
    }
}