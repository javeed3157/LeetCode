// Time:O(n)
// Space:O(1)
public class Final_Value_of_Variable_After_Performing_Operations {
    public static int finalValueAfterOperations(String[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(arr[i].charAt(1) == '+'){
                sum += 1;
            }
            else{
                sum -= 1;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String[] arr = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(arr));
    }
}
