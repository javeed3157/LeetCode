// Time:O(n)
// Space:O(1)
class Solution {
    class Node {
        int val;
        Node next;
        Node random;
    
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        if(head == null){
            return head;
        }
        Node curr = head, nex = null;
        while(curr != null){
            nex = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = nex;
            curr = nex;
        }
        curr = head;
        while(curr != null){
            if(curr.random != null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        curr = head;
        Node dummy = new Node(0);
        Node copy = head.next;
        dummy.next = copy;
        while(copy.next != null){
            curr.next = curr.next.next;
            curr = curr.next;
            copy.next = copy.next.next;
            copy = copy.next;
        }
        curr.next = curr.next.next;
        return dummy.next;
    }
}
public class Copy_List_with_Random_Pointer{

}