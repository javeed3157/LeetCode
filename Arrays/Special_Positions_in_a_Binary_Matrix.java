//Time:O(nm)
//Space:O(n+m)
public class Special_Positions_in_a_Binary_Matrix {
    public static int numSpecial(int[][] mat) {
        int count=0;
        int a[]=new int[mat.length];
        int b[]=new int[mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    a[i]+=1;
                    b[j]+=1;
                }
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1 && a[i]==1 && b[j]==1){
                    count+=1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[][]={{1,0,0},{0,0,1},{1,0,0}};
        System.out.println(numSpecial(arr));
    }
}
