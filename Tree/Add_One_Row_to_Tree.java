// Time:O(n)
// Space:O(n)
class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth < 2){
            TreeNode newer = new TreeNode(val);
            if(depth == 1){
                newer.left = root;
            }
            else{
                newer.right = root;
            }
            return newer;
        }
        if(root == null){
            return null;
        }
        root.left = addOneRow(root.left, val, depth - 1);
        root.right = addOneRow(root.right, val, depth == 2 ? 0 : depth - 1);
        return root;
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
public class Add_One_Row_to_Tree {
    
}
