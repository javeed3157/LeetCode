//Time:O(mn)
//Space:O(1)
public class Set_Matrix_Zeroes{
    // Brute Force Approach (Time:O(mn)*O(m+n) Space:O(1))
    // public static void setZeroes(int[][] matrix) {
    //     int r=0;
    //     int c=0;
    //     boolean check=false;
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(matrix[i][j]==0){
    //                 check=true;
    //                 r=i;
    //                 c=j;
    //                 for(int k=0;k<matrix[0].length;k++){
    //                     if (k!=c && matrix[r][k]!=0){
    //                     matrix[r][k]=-1;}
    //                 }
    //                 for(int k=0;k<matrix.length;k++){
    //                     if (k!=r && matrix[k][c]!=0){
    //                     matrix[k][c]=-1;}
    //                 }
    //             }
    //         }
    //     }
    //     if(check==false){
    //         for(int i=0;i<matrix.length;i++){
    //             for(int j=0;j<matrix[0].length;j++){
    //                 System.out.print(matrix[i][j]);
    //             }
    //             System.out.println();
    //         }
    //     }
    //     else{
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(matrix[i][j]==-1){
    //                 matrix[i][j]=0;
    //                 System.out.print(matrix[i][j]);
    //             }
    //             else{                    
    //             System.out.print(matrix[i][j]);}
    //             }
    //         System.out.println();
    //     }
    // }
    //Time:O(mn)
    //Space:O(m+n)
    // public static void setZeroes(int[][] matrix) {
    // int row[]=new int[matrix.length];
    // int col[]=new int[matrix[0].length];
    // for(int i=0;i<matrix.length;i++){
    //     for(int j=0;j<matrix[0].length;j++){
    //         if(matrix[i][j]==0){
    //             row[i]=1;
    //             col[j]=1;
    //         }
    //     }
    // }
    // for(int i=0;i<matrix.length;i++){
    //     for(int j=0;j<matrix[0].length;j++){
    //         if(row[i]==1 || col[j]==1){
    //             matrix[i][j]=0;
    //         }
    //     }
    // }
    // for(int i=0;i<matrix.length;i++){
    //     for(int j=0;j<matrix[0].length;j++){
    //         System.out.print(matrix[i][j]);
    //     }
    //     System.out.println();
    // }
    // }

    public static void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int colze=1;
        for(int i=0;i<row;i++){
            if(matrix[i][0]==0){
                colze=0;
            }
            for(int j=1;j<col;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=1;j--){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
            if(colze==0){
                matrix[i][0]=0;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        int arr[][]={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(arr);
    }
}