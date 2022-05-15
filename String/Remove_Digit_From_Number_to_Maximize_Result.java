import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Time:O(n)
// Space:O(n)
public class Remove_Digit_From_Number_to_Maximize_Result{
    public static String removeDigit(String number, char digit) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < number.length(); i++){
            if(number.charAt(i) == digit){
                String after_removingDigit = number.substring(0, i) + number.substring(i + 1);
                list.add(after_removingDigit);
            }
        }
        Collections.sort(list);
        return list.get(list.size() - 1);
    }
    public static void main(String[] args) {
        String number = "123";
        char digit = '3';
        System.out.println(removeDigit(number, digit));
    }
}