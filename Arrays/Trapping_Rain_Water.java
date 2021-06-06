//Time:O(n)
//Space:O(1)
public class Trapping_Rain_Water {
    public static int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int lmax=0;
        int rmax=0;
        int count=0;
        while(left<=right){
            if(height[left]<=height[right]){
                if(lmax<=height[left]){
                    lmax=height[left];
                }
                else{
                    count+=lmax-height[left];
                }
                left+=1;
            }
            else{
                if(rmax<=height[right]){
                    rmax=height[right];
                }
                else{
                    count+=rmax-height[right];
                }
                right-=1;
            }
        }
        return count;
        //Time:O(n)
        //Space:O(n)
        // int left[]=new int[height.length];
        // int right[]=new int[height.length];
        // if(height.length==0){
        //     return 0;
        // }
        // left[0]=height[0];
        // for(int i=1;i<height.length;i++){
        //     left[i]=Math.max(left[i-1],height[i]);
        // }
        // right[height.length-1]=height[height.length-1];
        // for(int i=height.length-2;i>=0;i--){
        //     right[i]=Math.max(right[i+1],height[i]);
        // }
        // int count=0;
        // for(int i=0;i<height.length;i++){
        //     count+=Math.min(left[i],right[i])-height[i];
        // }
        // return count;
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
}
