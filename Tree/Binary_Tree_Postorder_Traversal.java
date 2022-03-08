// Time:O(n)
// Space:O(n)
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        if(root == null){
            return l;
        }
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while(!st.isEmpty() || curr != null){
            if(curr != null){
                st.push(curr);
                curr = curr.left;
            }
            else{
                TreeNode temp = st.peek().right;
                if(temp == null){
                    temp = st.pop();
                    l.add(temp.val);
                    while(!st.isEmpty() && temp == st.peek().right){
                        temp = st.pop();
                        l.add(temp.val);
                    }
                }
                else{
                    curr = temp;
                }
            }
        }
        return l;
    }
    // public List<Integer> postorderTraversal(TreeNode root) {
    //     List<Integer> l = new ArrayList<>();
    //     postorder(root, l);
    //     return l;
    // }
    // public void postorder(TreeNode root, List<Integer> l){
    //     if(root == null){
    //         return;
    //     }
    //     postorder(root.left, l);
    //     postorder(root.right, l);
    //     l.add(root.val);
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
public class Binary_Tree_Postorder_Traversal {
    
}
