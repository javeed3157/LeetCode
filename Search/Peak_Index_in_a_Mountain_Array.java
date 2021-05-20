//Time:O(log(n))
//Space:O(1)
public class Peak_Index_in_a_Mountain_Array {
    public static int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=(s+e)/2;
            if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int ar[] = {24,69,100,99,79,78,67,36,26,19};
        System.out.println(peakIndexInMountainArray(ar));
    }
}
