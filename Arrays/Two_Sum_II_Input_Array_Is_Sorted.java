// Time:O(logn)
// Space:O(n)
public class Two_Sum_II_Input_Array_Is_Sorted {
    public static int[] twoSum(int[] numbers, int target) {
        int l=0;
        int h=numbers.length-1;
        int[] a=new int[2];
        while(l<=h){
            if(numbers[l]+numbers[h]==target){
                a[0]=l+1;
                a[1]=h+1;
                return a;
            }
            else if(numbers[l]+numbers[h]>target){
                h-=1;
            }
            else{
                l+=1;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        for(int i:twoSum(numbers, target)){
            System.out.print(i + " ");
        }
    }
}
