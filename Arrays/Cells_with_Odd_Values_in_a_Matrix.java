//Time:O(m*n)
//Space:O(m+n)
public class Cells_with_Odd_Values_in_a_Matrix {
    public static int oddCells(int m, int n, int[][] indices) {
        int r[]=new int[m];
        int c[]=new int[n];
        int count=0;
        for(int[] i:indices){
            r[i[0]]+=1;
            c[i[1]]+=1;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((r[i]+c[j])%2!=0){
                    count+=1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int a[][]={{0,1},{1,1}};
        int row=2;
        int col=3;
        System.out.println(oddCells(row, col, a));
    }
}
