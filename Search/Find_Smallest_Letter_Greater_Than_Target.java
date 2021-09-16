//Time:O(log(n))
//Space:O(1)
public class Find_Smallest_Letter_Greater_Than_Target {
    public static char nextGreatestLetter(char[] a, char target) {
        if(target>=a[a.length-1]){
            return a[0];
        }
        int l=0;
        int h=a.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(a[mid]<=target){
                l=mid+1; 
            }
            else{
                h=mid-1;
            }
        }
        return a[l];
    }
    public static void main(String[] args) {
        char[] ar={'c','f','j'};
        char tar='c';
        System.out.println(nextGreatestLetter(ar, tar));
    }
}
