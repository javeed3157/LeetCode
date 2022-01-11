// Time:O(max(l1,l2)) + O(2n)
// Space:O(max(l1,l2))
class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reversedList(l1);
        l2 = reversedList(l2);
        ListNode head = new ListNode();
        ListNode dummy = head;
        int carry = 0, sum = 0;
        while(l1 != null || l2 != null || carry > 0){
            sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            dummy.next = new ListNode(sum % 10);
            dummy = dummy.next;
            carry = sum / 10;
        }
        return reversedList(head.next);
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
public class Add_Two_Numbers_II {
    
}
