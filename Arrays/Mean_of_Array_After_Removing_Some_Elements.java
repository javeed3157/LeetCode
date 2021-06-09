//Time:O(nlogn)
//Space:O(1)
import java.util.Arrays;
public class Mean_of_Array_After_Removing_Some_Elements{
    public static double trimMean(int[] arr) {
        Arrays.sort(arr);
        int a=(int) (arr.length*0.05);
        int e=arr.length-a;
        double mean=0;
        for(int i=a;i<e;i++){
            mean+=arr[i];
        }
        return mean/(e-a);
    }
    public static void main(String[] args) {
        int array[]={1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3};
        System.out.println(trimMean(array));
    }
}