import java.util.ArrayList;
import java.util.List;
//Time:O(n)
//Space:O(1)
public class Count_Items_Matching_a_Rule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        if(ruleKey.equals("type")){
            for(int i=0;i<items.size();i++){
                if(items.get(i).get(0).equals(ruleValue)){
                    count+=1;
                }
            }
        }
        else if(ruleKey.equals("color")){
            for(int i=0;i<items.size();i++){
                if(items.get(i).get(1).equals(ruleValue)){
                    count+=1;
                }
            }
        }
        else{
            for(int i=0;i<items.size();i++){
                if(items.get(i).get(2).equals(ruleValue)){
                    count+=1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        List<List<String>> arr=new ArrayList<List<String>>();
        List<String> a=new ArrayList<String>();
        a.add("phone");
        a.add("blue");
        a.add("pixel");
        arr.add(a);
        List<String> b=new ArrayList<String>();
        b.add("computer");
        b.add("silver");
        b.add("lenovo");
        arr.add(b);
        List<String> c=new ArrayList<String>();
        c.add("phobe");
        c.add("gold");
        c.add("iphone");
        arr.add(c);
        String rK="color";
        String rV="silver";
        System.out.println(countMatches(arr, rK, rV));
    }
}
