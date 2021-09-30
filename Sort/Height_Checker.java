import java.util.Arrays;
//Time:O(nlog(n))
//Space:O(n)
public class Height_Checker{
    public static int heightChecker(int[] heights) {
        int n[]=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            n[i]=heights[i];
        }
        Arrays.sort(n);
        int count=0;
        for(int i=0;i<n.length;i++){
            if(n[i]!=heights[i]){
                count+=1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int a[]={1,1,4,2,1,3};
        System.out.println(heightChecker(a));
    }
}
