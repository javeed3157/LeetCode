//Time:O(n/2)
//Space:O(1)
class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null  ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Time:O(n+n/2)
    // Space:O(1)
    // public ListNode middleNode(ListNode head) {
    //     int size = 0;
    //     ListNode curr = head;
    //     while(curr != null){
    //         size += 1;
    //         curr = curr.next;
    //     }
    //     curr = head;
    //     for(int i=0;i<size/2;i++){
    //         curr = curr.next;
    //     }
    //     return curr;
    // }
}
public class Middle_of_the_Linked_List {
    
}
