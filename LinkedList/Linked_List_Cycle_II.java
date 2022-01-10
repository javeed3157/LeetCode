// Time:O(n)
// Space:O(1)

// 2*slow = fast
// 2(l1 + l2) = l1 + l2 + nc
// l1 = nc - l2
// So slow and entry meet at the cycle starting point
class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode entry = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                // Finding the cycles starting point
                while(slow != entry){
                    slow = slow.next;
                    entry = entry.next;
                }
                return entry;
            }
        }
        return null;
    }
}
public class Linked_List_Cycle_II {
    
}
