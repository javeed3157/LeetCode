import java.util.ArrayList;
import java.util.List;
//Time:O(n)
//Space:O(n)
public class Kids_With_the_Greatest_Number_of_Candies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxi=candies[0];
        List<Boolean> list=new ArrayList<Boolean>();
        for(int i=1;i<candies.length;i++){
            maxi=Math.max(maxi,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i] >= maxi-extraCandies){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,1,3};
        int n=3;
        System.out.println(kidsWithCandies(arr,n));

    }
}
