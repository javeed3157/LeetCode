//Time:O(n)
//Space:O(n)
public class Concatenation_of_Array {
    public static int[] getConcatenation(int[] nums) {
        int a[]=new int[2*nums.length];
        for(int i=0;i<a.length;i++){
            if(i<a.length/2){
                a[i]=nums[i];
            }
            else{
                a[i]=nums[i-nums.length];
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[]={1,2,1};
        for(int i:getConcatenation(arr)){
            System.out.print(i+" ");
        }
    }
}
