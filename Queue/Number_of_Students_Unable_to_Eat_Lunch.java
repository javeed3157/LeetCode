// Time:O(n)
// Space:O(n)
public class Number_of_Students_Unable_to_Eat_Lunch {
    public static int countStudents(int[] students, int[] sandwiches) {
        int zer = 0;
        int one = 0;
        for(int i : students){
            if(i == 0){
                zer += 1;
            }
            else{
                one += 1;
            }
        }
        for(int i : sandwiches){
            if(i == 0){
                if(zer == 0){
                    return one;
                }
                zer -= 1;
            }
            else{
                if(one == 0){
                    return zer;
                }
                one -= 1;
            }
        }
        return 0;
    }

    // Time:O(n)
    // Space:O(n)
    // public static int countStudents(int[] students, int[] sandwiches) {
    //     Queue<Integer> q = new LinkedList<>();
    //     for(int i : students){
    //         q.add(i);
    //     }
    //     int count = 0, top = 0;
    //     while(!q.isEmpty() && count != q.size()){
    //         if(q.peek() == sandwiches[top]){
    //             q.poll();
    //             count = 0;
    //             top += 1;
    //         }
    //         else{
    //             q.add(q.poll());
    //             count += 1;
    //         }
    //     }
    //     return q.size();
    // }
    public static void main(String[] args) {
        int[] a1 = {1, 1, 0, 0};
        int[] a2 = {0, 1, 0, 1};
        System.out.println(countStudents(a1, a2));
    }
}
