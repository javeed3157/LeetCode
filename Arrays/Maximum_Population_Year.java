//Time:O(n)
//Space:O(101)
public class Maximum_Population_Year {
    public static int maximumPopulation(int[][] logs) {
        int a[]=new int[101];
        for(int i=0;i<logs.length;i++){
            a[logs[i][0]-1950]+=1;
            a[logs[i][1]-1950]-=1;
        }
        int yr=0;
        int max=a[0];
        for(int i=1;i<101;i++){
            a[i]=a[i]+a[i-1];
            if(a[i]>max){
                yr=i;
                max=a[i];
            }
        }
        return yr+1950;
    }
    public static void main(String[] args) {
        int arr[][]={{2025,2041},{1988,2007},{2003,2046},{2045,2049},{2025,2027},{2014,2040},{2014,2027},{2011,2027},{1972,2019}};
        System.out.println(maximumPopulation(arr));
    }
}
