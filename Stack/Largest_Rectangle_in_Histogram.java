// Time:O(n)
// Space:O(n)
import java.util.Stack;
public class Largest_Rectangle_in_Histogram {
    public static int largestRectangleArea(int[] heights) {
        int max = 0;
        int n = heights.length;
        int[] ps = prevSmaller(heights);
        int[] ns = nextSmaller(heights);
        for(int i = 0; i < n; i++){
            int curr = (ns[i] - ps[i] - 1) * heights[i];
            max = Math.max(max, curr);
        }
        return max;
    }
    public static int[] prevSmaller(int[] arr){
        int n = arr.length;
        int[] ps = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ps[i] = -1;
            }
            else{
                ps[i] = s.peek();
            }
            s.push(i);
        }
        return ps;
    }
    public static int[] nextSmaller(int[] arr){
        int n = arr.length;
        int[] ns = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i = n - 1; i >= 0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ns[i] = n;
            }
            else{
                ns[i] = s.peek();
            }
            s.push(i);
        }
        return ns;
    }
    public static void main(String[] args) {
        int[] a = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(a));
    }
}
