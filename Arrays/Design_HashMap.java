class MyHashMap {
    List<Integer> l;
    HashMap<Integer, Integer> map;
    public MyHashMap() {
        l = new LinkedList<>();
        map = new HashMap<>();
    }
    
    public void put(int key, int value) {
        map.put(key, value);
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            return map.get(key);
        }
        return -1;
    }
    
    public void remove(int key) {
        map.remove(key);
    }
}
public class Design_HashMap {
    
}
