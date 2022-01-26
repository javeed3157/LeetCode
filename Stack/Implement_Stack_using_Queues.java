// Time:O(n)
// Space:O(n)
import java.util.LinkedList;
import java.util.Queue;
public class Implement_Stack_using_Queues {
    // Normal method using two ques :
    // Take q1, q2
    // push to q2
    // then push element by element from q1 to q2
    // then swap q1 and q1

    class MyStack {
        Queue<Integer> q;
        public MyStack() {
            q = new LinkedList<>();
        }
        
        public void push(int x) {
            q.add(x);
            for(int i = 0; i < q.size() - 1; i++){
                q.add(q.remove());
            }
        }
        
        public int pop() {
            return q.remove();
        }
        
        public int top() {
            return q.peek();
        }
        
        public boolean empty() {
            if(q.size() == 0){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        // MyStack obj = new MyStack();
        // obj.push(x);
        // int param_2 = obj.pop();
        // int param_3 = obj.top();
        // boolean param_4 = obj.empty();
    }
}
