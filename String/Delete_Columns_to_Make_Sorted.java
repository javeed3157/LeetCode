// Time:O(n^2)
// Space:O(n^2)
public class Delete_Columns_to_Make_Sorted {
    public static int minDeletionSize(String[] strs) {
        int ans = 0;
        int rows = strs.length;
        int cols = strs[0].length();
        int[][] mat = new int[rows][cols];
        for(int i = 0; i < cols; i++){
            for(int j = 0; j < rows - 1; j++){
                if(strs[j].charAt(i) > strs[j + 1].charAt(i)){
                    ans += 1;
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] strs = {"abc", "bce", "cae"};
        System.out.println(minDeletionSize(strs));
    }
}
