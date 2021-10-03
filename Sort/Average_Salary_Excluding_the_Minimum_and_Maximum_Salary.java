//Time:O(n)
//Space:O(1)
public class Average_Salary_Excluding_the_Minimum_and_Maximum_Salary {
    public static double average(int[] salary) {
        double count=0;
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<salary.length;i++){
            maxi=Math.max(maxi,salary[i]);
            mini=Math.min(mini,salary[i]);
            count+=salary[i];
        }
        return (count-maxi-mini)/(salary.length-2);
    }
    //We can do by sorting then the timecomplexity will be O(nlog(n))
    public static void main(String[] args) {
        int a[]={4000,3000,1000,2000};
        System.out.println(average(a));
    }
}
