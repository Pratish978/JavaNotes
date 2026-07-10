import java.util.ArrayList;

public class Practice5 {

    public static void main(String[] args) {

        ArrayList<Integer> nums =
        new ArrayList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);

        System.out.println(nums);

        nums.set(1,50);

        System.out.println(nums);

        nums.remove(0);

        System.out.println(nums);

        System.out.println(nums.size());
    }
}