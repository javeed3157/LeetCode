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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);
        int ans = Math.max(lh+rh+2,Math.max(ld,rd));
        return ans;
    }
    public int height(TreeNode node){
        if(node == null){
            return -1;
        }
        int lh = height(node.left);
        int rh = height(node.right);
        int h = 0;
        if(lh > rh){
            h = 1 + lh;
        }
        else{
            h = 1 + rh;
        }
        return h;
    }
}
public class Diameter_of_Binary_Tree{

}