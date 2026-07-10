import java.util.HashSet;

public class Practice8 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Html");
        set.add("CSS");
        set.add("Java");

        System.out.println(set.size());
    }
}