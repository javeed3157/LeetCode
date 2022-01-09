class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
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
}
public class Merge_Two_Sorted_Lists {
    
}
