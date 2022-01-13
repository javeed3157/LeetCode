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

    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode t1 = head;
        ListNode t2 = head;
        for(int i = 1; i < k; i++){
            fast = fast.next;
        }
        t1 = fast;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        t2 = slow;
        int temp = t1.val;
        t1.val = t2.val;
        t2.val = temp;
        return head;        
    }

    // Time:O(n)
    // Space:O(n)
    // public ListNode swapNodes(ListNode head, int k) {
    //     if(head == null || head.next == null){
    //         return head;
    //     }
    //     int size = 0;
    //     ListNode curr = head;
    //     while(curr != null){
    //         curr = curr.next;
    //         size += 1;
    //     }
    //     curr = head;
    //     int[] arr = new int[size];
    //     for(int i = 0; i < size; i++){
    //         arr[i] = curr.val;
    //         curr = curr.next;
    //     }
    //     int temp = arr[k - 1];
    //     arr[k - 1] = arr[size - k];
    //     arr[size - k] = temp;
    //     ListNode temps = new ListNode();
    //     curr = temps;
    //     for(int i = 0; i < size; i++){
    //         curr.next = new ListNode(arr[i]);
    //         curr = curr.next;
    //     }
    //     return temps.next;
    // }
}
public class Swapping_Nodes_in_a_Linked_List {
    
}
