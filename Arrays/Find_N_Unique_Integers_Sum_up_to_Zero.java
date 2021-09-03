//Time:O(n)
//Space:O(n)
public class Find_N_Unique_Integers_Sum_up_to_Zero {
    public static int[] sumZero(int n) {
        int[] a=new int[n];
        int i=0;
        int j=n-1;
        while(i<j){
            a[i]=i+1;
            a[j]=-1*(i+1);
            i+=1;
            j-=1;
        }
        return a;
    }
    public static void main(String[] args) {
        int n=5;
        for(int i:sumZero(n)){
            System.out.print(i+" ");
        }
    }
}
