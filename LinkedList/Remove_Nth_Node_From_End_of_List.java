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
    // Two pointer approach
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for(int i = 1; i <= n; i++){
            fast = fast.next;
        }
        if(fast == null){
            return head.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    // Time:O(2n)
    // Space:O(1)
    // public ListNode removeNthFromEnd(ListNode head, int n) {
    //     if(head.next == null){
    //         return null;
    //     }
    //     ListNode curr = head;
    //     int size = 0;
    //     while(curr != null){
    //         size += 1;
    //         curr = curr.next;
    //     }
    //     if(n == size){
    //         return head.next;
    //     }
    //     ListNode prev = head;
    //     int ind = size - n;
    //     int i = 1;
    //     while(i < ind){
    //         prev = prev.next;
    //         i+=1;
    //     }
    //     prev.next = prev.next.next;
    //     return head;
    // }
}
public class Remove_Nth_Node_From_End_of_List {
    
}