
 
//Linear search in an array
public class Practice18 {
    public static void main(String[] args) {
        int[] num={10,20,30,40,50};
        int target=30;

        for(int n:num){
            if(n==target){
                System.out.println("Found at index: "+ n);
            }
        }
    }
}
