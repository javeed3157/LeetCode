// Time:O(n)
// Space:O(1)
public class Minimum_Time_to_Make_Rope_Colorful {
    public static int minCost(String colors, int[] neededTime) {
        int minc = 0;
        int prev = neededTime[0];
        for(int i = 1; i < colors.length(); i++){
            if(colors.charAt(i) == colors.charAt(i - 1)){
                minc += Math.min(neededTime[i], prev);
                prev = Math.max(neededTime[i], prev);
            }
            else{
                prev = neededTime[i];
            }
        }
        return minc;
    }
    public static void main(String[] args) {
        String colors = "aabaa";
        int[] neededTime = {1, 2, 3, 4, 1};
        System.out.println(minCost(colors, neededTime));
    }
}
