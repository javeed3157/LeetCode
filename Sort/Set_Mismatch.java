//Time:O(n)
//Space:O(n)
public class Set_Mismatch{
    public static int[] findErrorNums(int[] nums) {
        int a[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            a[nums[i]]-=1;
        }
        int missing=0;
        int rep=0;
        for(int i=1;i<a.length;i++){
            if(a[i]==0){
                missing=i;
            }
            if(a[i]==-2){
                rep=i;
            }
        }
        return new int[]{rep,missing};
    }
    public static void main(String[] args) {
        int a[]={1,2,2,4};
        for(int i:findErrorNums(a)){
            System.out.print(i+" ");
        }
    }
}