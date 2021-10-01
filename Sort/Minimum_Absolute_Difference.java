import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
//Time:O(nlog(n))
//Space:O(1)
public class Minimum_Absolute_Difference {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList();
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < min) {
                min = diff;
                res.clear();
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            } else if (diff == min) {
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={4,2,1,3};
        for(List<Integer> i:minimumAbsDifference(a)){
            System.out.print(i+" ");
        }
    }
}
