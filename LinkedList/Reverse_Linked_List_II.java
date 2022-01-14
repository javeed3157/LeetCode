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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next == null){
            return head;
        }
        ListNode curr = head;
        int size = 0;
        while(curr != null){
            curr = curr.next;
            size += 1;
        }
        curr = head;
        ListNode prev = null;
        // Iterate till curr points to left
        for(int i = 1; i < left; i++){
            prev = curr;
            curr = curr.next;
        }
        ListNode prevPtr = prev, tail = curr; 
        ListNode nex = null;
        // Iterate till we reverse the nodes from left to right
        for(int i = left; i <= right; i++){
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        // Assigning the nodes of head and tail to list
        if(prevPtr != null){
            prevPtr.next = prev;   
        }
        else{
            head = prev;
        }
        tail.next = curr;
        return head;
    }
}
public class Reverse_Linked_List_II {
    
}
