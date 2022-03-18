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
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        while(head != null){
            ans = ans * 2 + head.val;
            head = head.next;
        }
        return ans;
    }
}
public class Convert_Binary_Number_in_Linked_List_to_Integer {
    
}
