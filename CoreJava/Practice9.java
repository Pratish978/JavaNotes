import java.util.HashMap;

public class Practice9 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        
        map.put(10,"Java");
        map.put(20,"HTML");
        map.put(30,"CSS");
        
        for(Integer key : map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }
    }
}