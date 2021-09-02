//Time:O(n)
//Space:O(1)
public class Matrix_Diagonal_Sum {
    public static int diagonalSum(int[][] mat) {
        // int sum=0;
        // int ks=0;
        // int ke=mat[0].length-1;
        // int i=0;
        // while(ks<mat[0].length && ke>=0){
        //     sum+=mat[i][ks++];
        //     sum+=mat[i][ke--];
        //     i+=1;
        // }
        // if(mat[0].length%2!=0){
        //     return sum-mat[mat[0].length/2][mat[0].length/2];
        // }
        // return sum;

        //Simple approach
        int res=0;
        int n=mat.length;
        for (int i=0; i<n; i++) {
            res+=mat[i][i]; 
            res+=mat[n-1-i][i]; 
        }
        return n%2==0 ? res:res-mat[n/2][n/2];
    }
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(a));
    }
}
