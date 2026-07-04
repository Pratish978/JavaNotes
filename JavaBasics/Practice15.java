

public class Practice15 {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 20, 80, 30};
        int largest = numbers[0];
        
        for(int num : numbers){
            if(num > largest){
                largest = num;
            }
        }
        System.out.println(largest);
    }
}
