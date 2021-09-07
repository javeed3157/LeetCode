import java.util.ArrayList;
import java.util.List;
//Time:O(n)
//Space:O(n)
public class Insert_Interval{
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res=new ArrayList<>();
        int start=newInterval[0];
        int end=newInterval[1];
        for(int[] i:intervals){
            if(i[1]<start){
                res.add(new int[]{i[0],i[1]});
            }
            else if(i[0]>end){
                res.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
            else{
                start=Math.min(start,i[0]);
                end=Math.max(end,i[1]);
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[0][]);
    }
    public static void main(String[] args) {
        int a[][]={{1,2},{3,5},{6,7},{8,10},{12,16}};
        int in[]={4,8};
        for(int[] i:insert(a,in)){
            for(int j=0;j<i.length;j++){
                System.out.print(i[j]+" ");
            }
            System.out.println();
        }
    }
}