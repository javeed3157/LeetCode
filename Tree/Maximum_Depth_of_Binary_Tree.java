// Time:O(n)
// Space:O(h)
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    // Time:O(n)
    // Space:O(n)
    // public int maxDepth(TreeNode root) {
    //     return height(root) + 1;
    // }
    // public int height(TreeNode node){
    //     if(node == null){
    //         return -1;
    //     }
    //     int lh = height(node.left);
    //     int rh = height(node.right);
    //     int h = 0;
    //     if(lh > rh){
    //         h = 1 + lh;
    //     }
    //     else{
    //         h = 1 + rh;
    //     }
    //     return h;
    // }
}
public class Maximum_Depth_of_Binary_Tree {
    
}
