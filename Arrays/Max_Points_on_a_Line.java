// Time:O(n^3)
// Space:O(1)
public class Max_Points_on_a_Line {
    public static int maxPoints(int[][] points) {
        int len = points.length;
        if(len <= 2){
            return len;
        }
        int maxi = 2;
        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                int tot = 2;
                for(int k = j + 1; k < len; k++){
                    if(k != i && k != j){
                        if(((points[i][1] - points[j][1])*(points[i][0] - points[k][0])) == ((points[i][1] - points[k][1])*(points[i][0] - points[j][0]))){
                            tot += 1;
                        }
                    }
                    maxi = Math.max(maxi, tot);
                }
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[][] points = {{1,1},{2,2},{3,3}};
        System.out.println(maxPoints(points));
    }
}
