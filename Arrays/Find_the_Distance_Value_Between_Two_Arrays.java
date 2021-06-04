//BruteForce
//Time:O(n^2)
//Space:O(1)
public class Find_the_Distance_Value_Between_Two_Arrays {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        boolean check=false;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j])>d){
                    check=true;
                }
                else{
                    check=false;
                    break;
                }
            }
            if(check==true){
                count+=1;
                check=false;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int array1[]={4,5,8};
        int array2[]={10,9,1,8};
        int dist=2;
        System.out.println(findTheDistanceValue(array1,array2,dist));
    }
}
