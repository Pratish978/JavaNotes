package CoreJava;

public class Practice2{

    public static void main(String[] args){

        try{

            int[] arr = {10,20,30};

            System.out.println(arr[4]);

        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array");
        }
        catch(Exception e){
            System.out.println("General");
        }

        System.out.println("End");
    }
}