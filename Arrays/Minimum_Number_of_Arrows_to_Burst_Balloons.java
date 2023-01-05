// Time:O(nlogn)
// Space:O(1)
import java.util.*;
public class Minimum_Number_of_Arrows_to_Burst_Balloons {
    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int arrows = 1;
        int start = points[0][1];
        for(int i = 1; i < points.length; i++){
            if(points[i][0] > start){
                arrows += 1;
                start = points[i][1];
            }
        }
        return arrows;
    }
    public static void main(String[] args) {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShots(points));
    }
}
