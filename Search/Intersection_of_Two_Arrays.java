//Time:O((m+n)log(n))
//Space:O(n)
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Intersection_of_Two_Arrays{
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<Integer>();
        if(nums1.length>nums2.length){
            Arrays.sort(nums2);
            for(int i:nums1){
                if(bs(nums2,i)){
                    s1.add(i);   
                }
            }
        }
        else{
            Arrays.sort(nums1);
            for(int i:nums2){
                if(bs(nums1,i)){
                    s1.add(i);   
                }
            }
        }
        int j=0;
        int arr[]=new int[s1.size()];
        for(Integer k:s1){
            arr[j++]=k;
        }
        return arr;
    }
    public static boolean bs(int a[],int tar){
        int l=0;
        int h=a.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(a[mid]==tar){
                return true;
            }
            else if(a[mid]<tar){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n1[]={1,2,2,1};
        int n2[]={2,2};
        for(int i:intersection(n1, n2)){
            System.out.print(i+" ");
        }
    }
}