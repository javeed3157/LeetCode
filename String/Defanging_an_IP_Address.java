// Time:O(n)
// Space:O(1)
public class Defanging_an_IP_Address {
    public static String defangIPaddr(String addr) {
        // String s = "";
        // for(int i = 0; i < addr.length(); i++){
        //     if(addr.charAt(i) == '.'){
        //         s += "[.]";
        //     }
        //     else{
        //         s += addr.charAt(i);
        //     }
        // }
        return addr.replace(".","[.]");
    }
    public static void main(String[] args) {
        String addr = "255.100.50.0";
        System.out.println(defangIPaddr(addr));
    }
}
