// TIme:O(nlogn)
// Space:O(n)
public class Merge_Similar_Items {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int len1 = items1.length;
        int len2 = items2.length;
        for(int i = 0; i < len1; i++){
            map.put(items1[i][0],items1[i][1]);
        }
        for(int i = 0; i < len2; i++){
            if(map.containsKey(items2[i][0])){
                map.put(items2[i][0],map.get(items2[i][0])+items2[i][1]);
            }
            else{
                map.put(items2[i][0],items2[i][1]);
            }
        }
        TreeMap<Integer, Integer> sorted = new TreeMap<>();
        sorted.putAll(map);
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        for (Map.Entry<Integer, Integer> entry : sorted.entrySet()){
            arr.add(Arrays.asList(entry.getKey(),entry.getValue()));
        }
        return arr;
    }
}
