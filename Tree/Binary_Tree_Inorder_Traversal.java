// Time:O(n)
// Space:O(n)
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        while(true){
            if(root != null){
                st.push(root);
                root = root.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                root = st.pop();
                l.add(root.val);
                root = root.right;
            }
        }
        return l;
    }
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     List<Integer> l = new ArrayList<>();
    //     inorder(root, l);
    //     return l;
    // }
    // public void inorder(TreeNode root, List<Integer> l){
    //     if(root == null){
    //         return;
    //     }
    //     inorder(root.left, l);
    //     l.add(root.val);
    //     inorder(root.right, l);
    // }
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
public class Binary_Tree_Inorder_Traversal {
    
}
