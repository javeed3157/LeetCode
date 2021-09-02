//Time:O(n)
//Space:O(26)
public class Check_if_the_Sentence_Is_Pangram {
    public static boolean checkIfPangram(String sentence) {
        char arr[]=new char[26];
        for(int i=0;i<sentence.length();i++){
            arr[(int)sentence.charAt(i)-97]=1;
        }
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(s));
    }
}
