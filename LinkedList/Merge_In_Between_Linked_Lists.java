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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr = list1, prev = null;
        int i = 0;
        // Finding the previous of ath node
        while(i < a){
            prev = curr;
            curr = curr.next;
            i += 1;
        }
        // Finding the next of bth node
        while(i < b){
            curr = curr.next;
            i += 1;
        }
        Connect the previous to list2 find end of list2 and connect next of current in list1
        prev.next = list2;
        while(list2.next != null){
            list2 = list2.next;
        }
        list2.next = curr.next;
        return list1;
    }
}
public class Merge_In_Between_Linked_Lists {
    
}
