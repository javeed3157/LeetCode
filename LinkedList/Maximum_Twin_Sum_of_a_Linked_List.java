// Time:O(3n/2)
// Space:O(1)
class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
    
        // Find the middle element
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        // Get the reverse of right half of the list
        slow.next = reversedList(slow.next);
        
         // Get our middle to the right half
        slow = slow.next;
        ListNode dummy = head;
        int max = -1;
        while(slow != null){
            int temp = slow.val + dummy.val;
            if(temp > max){
                max = temp;
            }
            slow = slow.next;
            dummy = dummy.next;
        }
        return max;
    }
    public ListNode reversedList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
public class Maximum_Twin_Sum_of_a_Linked_List {
    
}
