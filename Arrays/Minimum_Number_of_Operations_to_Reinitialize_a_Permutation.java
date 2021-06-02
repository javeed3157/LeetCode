//BruteForce
//O(n^2)
//O(n)
public class Minimum_Number_of_Operations_to_Reinitialize_a_Permutation {
    public static int reinitializePermutation(int n) {
        int arr[]=new int[n];
        int perm[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=i;
            perm[i]=i;
        }
        while(count<n){
            if(count%2==0){
                for(int i=0;i<n;i++){
                    if(i%2==0){
                        arr[i]=perm[i/2];
                    }
                    else{
                        arr[i]=perm[n/2 + (i-1)/2];
                    }
                }
                count+=1;
            }
            else{
                for(int i=0;i<n;i++){
                    if(i%2==0){
                        perm[i]=arr[i/2];
                    }
                    else{
                        perm[i]=arr[n/2 + (i-1)/2];
                    }
                }
                count+=1;
            }
            boolean same=false;
            if(count%2==0){
                for(int i=0;i<n;i++){
                if(perm[i]==i){
                    same=true;
                }
                else{
                    same=false;
                    break;
                }
            }
            }
            else{
                for(int i=0;i<n;i++){
                if(arr[i]==i){
                    same=true;
                }
                else{
                    same=false;
                    break;
                }
            }
            }
            if(same==true){
                return count;
            }
            else{
                continue;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int num=4;
        System.out.println(reinitializePermutation(num));
    }
}
