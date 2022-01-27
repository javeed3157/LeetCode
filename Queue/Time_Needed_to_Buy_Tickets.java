// Time:O(n)
// Space:O(1)
public class Time_Needed_to_Buy_Tickets {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int i = 0, count = 0;
        int n = tickets.length;
        while(tickets[k] != 0){
            if(tickets[i % n] != 0)
            {
                tickets[i % n] -= 1;
                count += 1;
            }
            i += 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] tickets = {2, 3, 2};
        int k = 2;
        System.out.println(timeRequiredToBuy(tickets, k));
    }
}
