import java.util.Arrays;
//Time:O(nlog(n))
//Space:O(1)
public class Assign_Cookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        for(;i<=g.length-1 && j<=s.length-1;j++ ){
            if(g[i]<=s[j]){
                i+=1;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int a[]={1,2};
        int b[]={1,2,3};
        System.out.println(findContentChildren(a, b));
    }
}
