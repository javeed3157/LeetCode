//Time:O(n)
//Space:O(n)
public class Make_Two_Arrays_Equal_by_Reversing_Sub_arrays {
    public static boolean canBeEqual(int[] target, int[] arr) {
        int c[]=new int[1001];
        for(int i=0;i<arr.length;i++){
            c[target[i]]+=1;
            c[arr[i]]-=1;
        }
        for(int i:c){
            if(i!=0){
                return false;
            }
        }
        return true;
        //Time:O(nlog(n))
        //Space:O(1)
        // Arrays.sort(target);
        // Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]!=target[i]){
        //         return false;
        //     }
        // }
        // return true;
    }
    public static void main(String[] args) {
        int tar[]={1,2,3,4};
        int arr[]={2,4,1,3};
        System.out.println(canBeEqual(tar, arr));
    }
}
