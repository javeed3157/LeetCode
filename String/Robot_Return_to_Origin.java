// Time:O(n)
// Space:O(1)
public class Robot_Return_to_Origin {
    public static boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char move: moves.toCharArray()) {
            if (move == 'U') y--;
            else if (move == 'D') y++;
            else if (move == 'L') x--;
            else if (move == 'R') x++;
        }
        return x == 0 && y == 0;
    }
    public static void main(String[] args) {
        String s = "UD";
        System.out.println(judgeCircle(s));
    }
}
