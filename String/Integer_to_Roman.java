// Time:O(n)
public class Integer_to_Roman{
    public static String intToRoman(int num) {
        if(num <= 0 || num >= 4000){
            return "";
        }
        String sym[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int val[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(num > 0){
            while(num >= val[i]){
                num -= val[i];
                ans.append(sym[i]);
            }
            i++;
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(intToRoman(3999));
    }
}