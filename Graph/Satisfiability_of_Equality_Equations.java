// Time:O(n)
// Space:O(n)
public class Satisfiability_of_Equality_Equations {
    public static int find(int v, int[] parent){
        if(parent[v] == v){
            return v;
        }
        return parent[v] = find(parent[v], parent);
    }
    public static boolean equationsPossible(String[] equations) {
        int[] parent = new int[26];
        for(int i = 0; i < 26; i++){
            parent[i] = i;
        }
        for(String s: equations){
            if(s.charAt(1) == '='){
                parent[find(s.charAt(3) - 'a', parent)] = find(s.charAt(0) - 'a', parent);
            }
        }
        for(String s: equations){
            if(s.charAt(1) == '!' && find(s.charAt(0) - 'a', parent) == find(s.charAt(3) - 'a', parent)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String[] equations = {"a==b","b!=a"};
        System.out.println(equationsPossible(equations));
    }
}
