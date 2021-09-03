//Time:O(n)
//Space:O(1)
public class Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums){
            int dig=i;
            String s=Integer.toString(dig);
            if(s.length()%2==0){
                count+=1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int a[]={12,345,2,6,7896};
        System.out.println(findNumbers(a));
    }
}
