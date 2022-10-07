// Time:O(n)
// Space:O(n)
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return checker(root, false);
    }
    public int checker(TreeNode root, boolean isLeft){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null && isLeft){
            return root.val;
        }
        return checker(root.left, true) + checker(root.right, false);
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
public class Sum_of_Left_Leaves {
    
}
