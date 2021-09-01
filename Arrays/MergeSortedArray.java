//Time:O(m+n)
// Space:O(1)
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            }
            else{
                nums1[k--]=nums2[j--];
            }
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }
    }
    public static void main(String[] args) {
        int ar1[]={1,2,3,0,0,0};
        int ar2[]={2,5,6};
        merge(ar1,3,ar2,3);
        for(int i:ar1){
            System.out.print(i+" ");
        }
    }
}
