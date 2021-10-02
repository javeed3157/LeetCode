//Time:O(n)
//Space:O(1)
public class Maximum_Product_of_Two_Elements_in_an_Array {
    public static int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        for(int i:nums){
            if(i>max1){
                max2 = max1;
                max1 = i;
            }
            else if(i>max2){
                max2 = i;
            }
        }
        return (max1-1)*(max2-1);
    }
    public static void main(String[] args) {
        int a[]={3,4,5,2};
        System.out.println(maxProduct(a));
    }
}
