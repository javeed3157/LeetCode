// Time:O(1)-->[Enqueue, Dequeue]
// Space:O(n)
class MyCircularQueue {
    int[] arr;
    int e = -1, s = 0;
    int len = 0;
    public MyCircularQueue(int k) {
        arr = new int[k];
    }
    
    public boolean enQueue(int value) {
        if(!isFull()){
            e = (e + 1)%arr.length;
            arr[e] = value;
            len += 1;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(!isEmpty()){
            s = (s + 1)%arr.length;
            len -= 1;
            return true;
        }
        return false;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return arr[s];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return arr[e];
    }
    
    public boolean isEmpty() {
        return len == 0;
    }
    
    public boolean isFull() {
        return len == arr.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
public class Design_Circular_Queue {
    
}
