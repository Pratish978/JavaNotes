

public class Practice16 {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 20, 80, 30};
        int Smallest = numbers[0];
        
        for(int num : numbers){
            if(num < Smallest){
                Smallest = num;
            }
        }
        System.out.println(Smallest);
    }
}
