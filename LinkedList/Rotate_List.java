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
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null || head.next == null){
            return head;
        }
        
        ListNode curr = head;
        int size = 0;

        // Calculating length
        while(curr.next != null){
            curr = curr.next;
            size += 1;
        }
        size += 1;
        k %= size;
        // Pointing last node to head
        curr.next = head;
        int ptNull = size - k;
        for(int i = 0; i < ptNull; i++){
            curr = curr.next;
        }
        // pointing the head and breaking at (size - k) 
        head = curr.next;
        curr.next = null;
        return head;
    }
}
public class Rotate_List {
    
}
