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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        
        // Find the middle element
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Get the reverse of right half of the list
        slow.next = reversedList(slow.next);
        
        // Get our middle to the right half
        slow = slow.next;
        ListNode dummy = head;
        
        // Check both halfs are equal or not
        while(slow != null){
            if(slow.val == dummy.val){
                slow = slow.next;
                dummy = dummy.next;
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public ListNode reversedList(ListNode head){
        if(head.next == null){
            return head;
        }
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

public class Palindrome_Linked_List {
    
}
