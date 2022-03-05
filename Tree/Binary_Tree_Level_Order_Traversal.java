// Time:O(n)
// Space:O(n)
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ll = new LinkedList<List<Integer>>();
        if(root == null){
            return ll;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> l = new LinkedList<>();
            for(int i = 0; i < n; i++){
                if(q.peek().left != null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right != null){
                    q.offer(q.peek().right);
                }
                l.add(q.poll().val);
            }
            ll.add(l);
        }
        return ll;
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
public class Binary_Tree_Level_Order_Traversal {
    
}
