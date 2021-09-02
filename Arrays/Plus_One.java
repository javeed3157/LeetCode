//Time:O(n)
//Space:O(1)
public class Plus_One{
    public static int[] plusOne(int[] a) {
        int b=a.length;
        for(int i=b-1;i>=0;i--){
            if(a[i]<9){
                a[i]+=1;
                return a;
            }
            a[i]=0;
        }
        int temp[]=new int[b+1];
        temp[0]=1;
        return temp;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        // int arr[]={9,9};
        for(int i:plusOne(arr)){
            System.out.print(i+" ");
        }
    }
}