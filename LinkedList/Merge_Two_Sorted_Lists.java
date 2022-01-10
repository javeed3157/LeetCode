// Time:O(m+n)
// Space:O(1)
class Solution {
    // Inplace approach
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val > list2.val){ // Smallest value stays in l1
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        ListNode res = list1;
        while(list1 != null && list2 != null){
            ListNode temp = null;
            while(list1 != null && list1.val <= list2.val){
                temp = list1;
                list1 = list1.next;
            }
            temp.next = list2;
            
            temp = list1;
            list1 = list2;
            list2 = temp;
        }
        return res;        
    }

    // Time:O(m+n)
    // Space:O(m+n)
    // public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    //     ListNode dummy = new ListNode(0);
    //     ListNode dummydup = dummy;
    //     while(true){
    //         if(list1 == null){
    //             dummydup.next = list2;
    //             break;
    //         }
    //         if(list2 == null){
    //             dummydup.next = list1;
    //             break;
    //         }
    //         if(list1.val > list2.val){
    //             dummydup.next = list2;
    //             list2 = list2.next;
                
    //         }
    //         else{
    //             dummydup.next = list1;
    //             list1 = list1.next;
    //         }
    //         dummydup = dummydup.next;
    //     }
    //     return dummy.next;
    // }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
public class Merge_Two_Sorted_Lists {
    
}
