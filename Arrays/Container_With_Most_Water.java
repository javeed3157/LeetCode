// Time:O(n)
// Space:O(1)
public class Container_With_Most_Water{
    public static int maxArea(int[] arr) {
        int max = 0;
        int area = 0;
        int l = 0;
        int h = arr.length - 1;
        while(l < h){
            int width = h - l;
            int length = Math.min(arr[l], arr[h]);
            area = length * width;
            max = Math.max(max, area);
            if(arr[l] < arr[h]){
                l += 1;
            }
            else{
                h -= 1;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}