package CoreJava;

public class Practice3 {
    public static void main(String[] args) {
        try{

    throw new ArithmeticException();

    }
    catch(ArithmeticException e){

    System.out.println("A");
   }
   catch(Exception e){

    System.out.println("B");
   }

    System.out.println("C");
    }
}
