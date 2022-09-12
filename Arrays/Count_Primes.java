// Time:O(n*log(log(n)))
// Space:O(n)
public class Count_Primes {
    public static int countPrimes(int n) {
        if(n == 0 || n == 1){
            return 0;
        }
        boolean arr[] = new boolean[n];
        for(int i = 0; i < n; i++){
            arr[i] = true;
        }
        for(int i = 2; i * i < n; i++){
            if(arr[i] == true){
                for(int p = i * i; p < n; p += i){
                    arr[p] = false;
                }
            }
        }
        int count = 0;
        for(int i = 2; i < n; i++){
            if(arr[i] == true){
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n));
    }
}
