//Time:O(n)
//Space:O(n)
public class Goal_Parser_Interpretation {
    public static String interpret(String command) {
        String s="";
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)!='(' && command.charAt(i)!=')'){
                s+=command.charAt(i);
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                s+='o';
            }
        }
        return s;
    }
    public static void main(String[] args) {
        String str="G()()()()(al)";
        System.out.println(interpret(str));
    }
}
