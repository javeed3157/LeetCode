// Time:O(2m)
// Space:O(1)
class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode dummy1 = headA;
        ListNode dummy2 = headB;
        while(dummy1 != dummy2){
            if(dummy1 == null){
                dummy1 = headB;
            }
            else{
                dummy1 = dummy1.next;
            }
            if(dummy2 == null){
                dummy2 = headA;
            }
            else{
                dummy2 = dummy2.next;
            }
        }
        return dummy1;
    }

    // Longer approach
    // Time:O(2m)
    // Space:O(1)
    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     if(headA.next == null && headB.next ==null){
    //         if(headA == headB){
    //             return headA;
    //         }
    //         else{
    //             return null;
    //         }
    //     }
    //     ListNode dummy1 = headA;
    //     ListNode dummy2 = headB;
    //     int sizeA = size(dummy1);
    //     int sizeB = size(dummy2);
    //     int diff = 0;
    //     if(sizeA > sizeB){
    //         diff = sizeA - sizeB;
    //         for(int i = 0; i < diff; i++){
    //             dummy1 = dummy1.next;
    //         }
    //         return check(dummy1, dummy2);
    //     }
    //     else{
    //         diff = sizeB - sizeA;
    //         for(int i = 0; i < diff; i++){
    //             dummy2 = dummy2.next;
    //         }
    //         return check(dummy1, dummy2);
    //     }        
    // }
    // public ListNode check(ListNode A,ListNode B){
    //     while(A != null){
    //         if(A == B){
    //             return A;
    //         }
    //         A = A.next;
    //         B = B.next;
    //     }
    //     return null;
    // }
    // public int size(ListNode curr){
    //     int len = 0;
    //     while(curr != null){
    //         curr = curr.next;
    //         len += 1;
    //     }
    //     return len;
    // }
}
public class Intersection_of_Two_Linked_Lists {
    
}
