// Time:O(n)
// Space:O(h)
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        int level = 0;
        ans(root, li, level);
        return li;
    }
    public void ans(TreeNode root, List<Integer> li, int level){
        if(root == null){
            return;
        }
        if(level == li.size()){
            li.add(root.val);
        }
        ans(root.right, li, level + 1);
        ans(root.left, li, level + 1);
    }
}
public class Binary_Tree_Right_Side_View {
    
}
