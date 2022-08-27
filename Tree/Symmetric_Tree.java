// Time;O(n)
// Space:O(n)
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
    public boolean isSymmetric(TreeNode root) {
        return root == null || checkSymm(root.left, root.right);
    }
    public boolean checkSymm(TreeNode l, TreeNode r){
        if(l == null || r == null){
            return l == r;
        }
        if(l.val != r.val){
            return false;
        }
        return checkSymm(l.left, r.right) && checkSymm(l.right, r.left); 
    }
}
public class Symmetric_Tree {
    
}
