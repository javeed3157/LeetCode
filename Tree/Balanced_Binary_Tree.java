// Time:O(n)
// Space:O(h)
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] maxi = {0};
        height(root, maxi);
        return maxi[0];
    }
    public int height(TreeNode node, int[] maxi){
        if(node == null){
            return 0;
        }
        int lh = height(node.left, maxi);
        int rh = height(node.right, maxi);
        maxi[0] = Math.max(maxi[0], lh + rh);
        return 1 + Math.max(lh, rh);
    }
}
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
//
// class Solution {
//     public boolean isBalanced(TreeNode root) {
//         return height(root) != -1;
//     }
//     public int height(TreeNode root){
//         if(root == null){
//             return 0;
//         }
//         int left = height(root.left);
//         int right = height(root.right);
//         if(left == -1 || right == -1){
//             return -1;
//         }
//         if(Math.abs(left - right) > 1){
//             return -1;
//         }
//         return 1 + Math.max(left, right);
//     }
// }
public class Balanced_Binary_Tree {
    
}
