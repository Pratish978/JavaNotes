import java.util.ArrayList;

public class Practice12 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);

       list.stream()
            .filter(num -> num > 10)
            .forEach(System.out::println);
    }
}
