import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
//Time:O(nlogn)+O(n)
//Space:O(n)
public class Merge_Intervals {
    public static int[][] merge(int[][] intervals) {
        List<int[]>  res=new ArrayList<>();
        if(intervals.length==0 || intervals==null){
            return res.toArray(new int[0][]);
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start=intervals[0][0];
        int end=intervals[0][0];
        for(int[] i:intervals){
            if(i[0]<=end){
                end=Math.max(i[1],end);
            }
            else{
                res.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[0][]);
    }
    public static void main(String[] args) {
        int inter[][]={{1,3},{2,6},{8,10},{15,18}};
        for(int[] i:merge(inter)){
            for(int j=0;j<i.length;j++){
                System.out.print(i[j]+" ");
            }
            System.out.println();
        }
    }
}
