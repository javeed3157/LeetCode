// Time:O(n)
// Space:O(n)
import java.util.Stack;

public class Next_Greater_Element_II{
    public static int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] a = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i = 2*n - 1; i >= 0 ; i--){
            while(!s.isEmpty() && s.peek() <= arr[i%n]){
                s.pop();
            }
            if(i < n){
                if(s.isEmpty()){
                    a[i] = -1; 
                }
                else{
                    a[i] = s.peek();
                }
            }
            s.push(arr[i%n]);
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        for(int i : nextGreaterElements(arr)){
            System.out.print(i + " ");
        }
    }
}