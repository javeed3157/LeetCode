// Time:O(n)
// Space:O(n)
class Solution {
    // public List<Integer> preorderTraversal(TreeNode root) {
    //     List<Integer> l = new ArrayList<>();
    //     if(root == null){
    //         return l;
    //     }
    //     Stack<TreeNode> st = new Stack<>();
    //     st.push(root);
    //     while(!st.isEmpty()){
    //         root = st.pop();
    //         l.add(root.val);
    //         if(root.right!=null){
    //             st.push(root.right);
    //         }
    //         if(root.left != null){
    //             st.push(root.left);
    //         }
    //     }
    //     return l;
    // }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        preorder(root, l);
        return l;
    }
    public void preorder(TreeNode root, List<Integer> l){
        if(root == null){
            return;
        }
        l.add(root.val);
        preorder(root.left, l);
        preorder(root.right, l);
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
public class Binary_Tree_Preorder_Traversal {
    
}
