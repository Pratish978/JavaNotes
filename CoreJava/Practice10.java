import java.util.*;

public class Practice10 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("HTML");
        list.add("CSS");

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}