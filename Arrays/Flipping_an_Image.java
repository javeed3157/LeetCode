//Time:O(n^2)
//Space:O(1)
public class Flipping_an_Image {
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            for(int j=0;j<(image[0].length+1)/2;j++){
                int temp=image[i][j]^1;
                image[i][j]=image[i][image[0].length-1-j]^1;
                image[i][image[0].length-1-j]=temp;
            }
        }
        return image;
    }
    public static void main(String[] args) {
        int a[][]={{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(a);
        for(int[] i:a){
            for(int j=0;j<a[0].length;j++){
                System.out.print(i[j]+" ");
            }
            System.out.println();
        }
    }
}
