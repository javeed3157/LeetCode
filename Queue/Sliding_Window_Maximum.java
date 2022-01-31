// Time:O(n)
// Space:O(k)
import java.util.ArrayDeque;
import java.util.Deque;

public class Sliding_Window_Maximum{
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int ind = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            if(!q.isEmpty() && q.peek() == i - k){
                q.poll();
            }
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i >= k - 1){
                ans[ind++] = nums[q.peek()];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k  =3;
        for(int i : maxSlidingWindow(nums, k)){
            System.out.print(i + " ");
        }
    }
}