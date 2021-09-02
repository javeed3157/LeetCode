//Time:O(n^2)
//Space:O(n)
public class Create_Target_Array_in_the_Given_Order {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int tar[]=new int [nums.length];
        for(int i=0;i<tar.length;i++){
            if(index[i]<i){
                for(int j=tar.length-1;j>index[i];j--){
                    tar[j]=tar[j-1];
                }
                tar[index[i]]=nums[i];
            }
            else{
                tar[index[i]]=nums[i];
            }
        }
        return tar;
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4};
        int ind[]={0,1,2,2,1};
        int target[]=createTargetArray(arr, ind);
        for(int i:target){
            System.out.print(i+" ");
        }
    }
}
