//Time:O(log(n))
//Space:O(1)
public class Kth_Missing_Positive_Number {
    public static int findKthPositive(int[] arr, int k) {
                int l=0,h=arr.length-1;
                while(l<=h){
                    int mid=l+(h-l)/2;
                    if(arr[mid]-mid-1<k){
                        l=mid+1;
                    }
                    else{
                        h=mid-1;
                    }
                }
                return l+k;
            }
    //Time:O(n)
    //Space:O(1)
    // public static int findKthPositive(int[] arr, int k) {
    //     if(arr[0]>k){
    //         return k;
    //     }
    //     k-=arr[0]-1;
    //     for(int i=0;i<arr.length-1;i++){
    //         int missing=arr[i+1]-arr[i]-1;
    //         if(missing>=k){
                
    //             return arr[i]+k;
    //         }
    //         k-=missing;
    //     }
    //     return arr[arr.length-1]+k;
    // }
    public static void main(String[] args) {
        int arr[]={2,3,4,7,11};
        int k=5;
        System.out.println(findKthPositive(arr, k));
    }
}
