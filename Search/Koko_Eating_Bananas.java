//Time:O(nlog(m))
//Space:O(1)
public class Koko_Eating_Bananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int e = 1;
        for(int i : piles){
            e = Math.max(e, i);
        }
        
        while(s <= e){
            int mid = s + (e - s)/2;
            int sum = 0;
            for(int j = 0; j < piles.length; j++){
                sum += Math.ceil((double)piles[j]/mid);
            }
            if(sum <= h){
                e = mid - 1;
            }
            else{
                s = mid + 1;   
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }
}
