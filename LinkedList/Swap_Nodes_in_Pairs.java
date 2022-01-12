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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        int size = 0;
        while(curr != null){
            curr = curr.next;
            size += 1;
        }
        int iter = size/2;
        ListNode dummy = new ListNode();
        ListNode prev = dummy, nex = dummy;
        dummy.next = head;
        while(iter > 0){
            curr = prev.next;
            nex = curr.next;
            for(int i = 1; i < 2; i++){
                curr.next = nex.next;
                nex.next = prev.next;
                prev.next = nex;
                nex = curr.next;
            }
            prev = curr;
            iter -= 1;
        }
        return dummy.next;
    }
}
public class Swap_Nodes_in_Pairs {
    
}
