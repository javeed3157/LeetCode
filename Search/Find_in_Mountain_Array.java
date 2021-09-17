
public class Find_in_Mountain_Array{
    public interface MountainArray {
        public int get(int index);
        public int length();
    }
    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int s=0;
        int e=mountainArr.length()-1;
        int mount=0;
        while(s<e){
            int mid=s+(e-s)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                s=mid+1;
                mount=s;
            }
            else{
                e=mid;
            }
        }
        s=0;
        e=mount;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }
            else if (mountainArr.get(mid)<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        s=mount;
        e=mountainArr.length()-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }
            else if (mountainArr.get(mid)>target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;        
    }
    public static void main(String[] args) {
        
    }
}