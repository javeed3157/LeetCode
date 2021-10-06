//Time:O(n)
//Space:O(1)
public class Sort_Colors {
    public static void sortColors(int[] nums) {
        int l=0;
        int m=0;
        int h=nums.length-1;
        while(m<=h){
            switch(nums[m]){
                case 0:{
                    int temp=nums[l];
                    nums[l]=nums[m];
                    nums[m]=temp;
                    l++;m++;
                    break;
                }
                case 1:{
                    m++;
                    break;
                }
                case 2:{
                    int temp=nums[h];
                    nums[h]=nums[m];
                    nums[m]=temp;
                    h--;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[]={2,0,2,1,1,0};
        sortColors(a);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
