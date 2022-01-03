//Time:O(n*2^n)
//Space:O(n)
import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {
    public static List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> l= new ArrayList<>();
        part(s,ans,l,0);
        return ans;
    }
    public static void part(String s, List<List<String>> ans,List<String> l,int idx){
        if(idx==s.length()){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isPal(s,idx,i)){
                l.add(s.substring(idx,i+1));
                part(s,ans,l,i+1);
                l.remove(l.size()-1);
            }
        }
    }
    public static boolean isPal(String s,int l,int h){
        while(l<=h){
            if(s.charAt(l)==s.charAt(h)){
                l++;
                h--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="aab";
        for(List l:partition(s)){
            System.out.println(l);
        }
    }
}
