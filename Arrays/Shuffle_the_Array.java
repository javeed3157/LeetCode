//Time:O(n)
//Space:O(1)
public class Shuffle_the_Array {
    public static int[] shuffle(int[] nums, int n) {
        int arr[]=new int[2*n];
        int j=n;
        int k=0;
        for(int i=0;i<n;i++){
            arr[k]=nums[i];
            k+=1;
            arr[k]=nums[j];
            k+=1;
            j+=1;
        }
        return arr;
    }
    public static void main(String[] args) {
        int ar[]={1,2,3,4,4,3,2,1};
        int in=4;
        for(int i:shuffle(ar,in)){
            System.out.print(i+",");
        }
    }
}
