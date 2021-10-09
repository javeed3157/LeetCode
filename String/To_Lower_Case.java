//Time:O(n)
//Space:O(n)
public class To_Lower_Case {
    public static String toLowerCase(String s) {
        char[] arr=s.toCharArray();
        for (int i=0;i<arr.length;i++){
            if ('A'<=arr[i] && arr[i]<='Z'){
                arr[i]+=32;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String str="Hello";
        System.out.println(toLowerCase(str));
    }
}
