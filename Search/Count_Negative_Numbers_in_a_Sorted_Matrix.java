//Time:O(log(m+n))
//Space:O(1)
public class Count_Negative_Numbers_in_a_Sorted_Matrix {
    public static int countNegatives(int[][] grid) {
        int count=0;
        int r=0;
        int c=grid[0].length-1;
        while(r<grid.length && c>=0){
            if(grid[r][c]<0){
                c-=1;
                count+=grid.length-r;
            }
            else{
                r+=1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[][]={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(arr));
    }
}
