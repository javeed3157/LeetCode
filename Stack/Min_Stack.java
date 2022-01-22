// Time:O(1)
// Space:O(1)
class MinStack {
    Node head;
    class Node{
        int val;
        Node next;
        int min;
        Node(int val, int min){
            this.val = val;
            this.next = null;
            //Here each node stores the min val till that node
            this.min = min;
        }
    }
    
    public void push(int val) {
        if(head == null){
            head = new Node(val, val);
            return;
        }
        Node newNode = new Node(val,Math.min(val, head.min));
        newNode.next = head;
        head = newNode;
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}
public class Min_Stack {
    
}
