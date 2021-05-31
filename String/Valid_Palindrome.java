//Time:O(n)
//Space:O(n)
public class Valid_Palindrome {
    public static boolean isPalindrome(String s) {
        s=s.replaceAll("\\s","");
        String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>64 && s.charAt(i)<91|| s.charAt(i)>96 && s.charAt(i)<123 ||                          s.charAt(i)>47 && s.charAt(i)<58){
                str=str+s.charAt(i);
            }
        }
        str=str.toLowerCase();
        if(str.length()==0){
            return true;
        }
        char c[]=str.toCharArray();
        boolean pal=true;
        for(int i=0;i<c.length/2;i++){
            if(c[i] != c[c.length-i-1]){
                pal=false;
                break;
            }
        }
        return pal;
    }
    public static void main(String[] args) {
        String a="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(a));
    }
}
