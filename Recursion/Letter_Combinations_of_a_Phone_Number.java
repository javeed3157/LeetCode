//Time:O(4^n)
import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> li=new ArrayList<>();
        if(digits==null || digits.length()==0){
            return li;
        }
        printCombi(digits,0,"",li);
        return li;
    }
        public static String[] keypad={" ",".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void printCombi(String str,int idx,String combination,List<String> li){
        if(idx==str.length()){
            li.add(combination);
            return;
        }
        char currChar=str.charAt(idx);
        String mapping=keypad[currChar-'0'];
        for(int i=0;i<mapping.length();i++){
            printCombi(str, idx+1, combination+mapping.charAt(i),li);
        }
    }
}
public class Letter_Combinations_of_a_Phone_Number{
    public static void main(String args[]){
        Solution s=new Solution();
        System.out.println(s.letterCombinations("23"));
    }
}
