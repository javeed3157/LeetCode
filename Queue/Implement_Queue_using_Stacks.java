import java.util.Stack;
// Time:O(1) amortized
// Space:O(n)
class MyQueue {
    Stack<Integer> sin;
    Stack<Integer> sout;
    public MyQueue() {
        sin = new Stack<>();
        sout = new Stack<>();
    }
    public void push(int x) {
        sin.push(x);
    }  
    public int pop() {
        if(!sout.isEmpty()){
            return sout.pop();
        }
        while(!sin.isEmpty()){
            sout.push(sin.pop());
        }
        return sout.pop();
    }
    
    public int peek() {
        if(!sout.isEmpty()){
            return sout.peek();
        }
        while(!sin.isEmpty()){
            sout.push(sin.pop());
        }
        return sout.peek();
    }

// Time:O(n)
// Space:O(n)

// class MyQueue {
//     Stack<Integer> s1;
//     Stack<Integer> s2;
//     public MyQueue() {
//         s1 = new Stack<>();
//         s2 = new Stack<>();
//     }
//     public void push(int x) {
//         while(!s1.isEmpty()){
//             s2.push(s1.pop());
//         }
//         s1.push(x);
//         while(!s2.isEmpty()){
//             s1.push(s2.pop());
//         }
//     }    
//     public int pop() {
//         return s1.pop();
//     }
    
//     public int peek() {
//         return s1.peek();
//     }
    
//     public boolean empty() {
//         return s1.isEmpty();
//     }
// }

public class Implement_Queue_using_Stacks {
    public static void main(String[] args) {
        // MyQueue obj = new MyQueue();
        // obj.push(x);
        // int param_2 = obj.pop();
        // int param_3 = obj.peek();
        // boolean param_4 = obj.empty();
    }
}
