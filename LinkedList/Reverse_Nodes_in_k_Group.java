// Time:O(n)
// Space:O(1)
class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null){
            return null;
        }
        ListNode curr = head;
        int size = 0;
        while (curr != null){
            curr = curr.next;
            size++;
        }
        ListNode dummy = new ListNode();
        ListNode prev = dummy, nexts = dummy;
        dummy.next = head;
        int iters = size/k;
        int count = k;
        while(iters > 0){
            curr = prev.next;
            nexts = curr.next;
            for(int i = 1; i < k; i++){
                curr.next = nexts.next;
                nexts.next = prev.next;
                prev.next = nexts;
                nexts = curr.next;
            }
            prev = curr;
            iters -= 1;
        }
        return dummy.next;
    }
    // public ListNode reverseKGroup(ListNode head, int k) {
    //     if(head == null){
    //         return null;
    //     }
    //     ListNode prev = null;
    //     ListNode curr = head;
    //     int size = 0;
    //      while (curr != null){
    //         curr = curr.next;
    //         size++;
    //     }
    //     if(size < k){
    //         return head;
    //     }
    //     curr = head;
    //     int count = 0;
    //     while(curr != null && count < k){
    //         ListNode next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //         count += 1;
    //     }
    //     head.next = reverseKGroup(curr, k);
    //     return prev;
    // }
}
public class Reverse_Nodes_in_k_Group {
    
}
