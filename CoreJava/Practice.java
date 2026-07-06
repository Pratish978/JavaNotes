package CoreJava;

public class Practice{

    public static void main(String[] args){

        System.out.println("A");

        try{
            int a = 20/0;
        }
        catch(Exception e){
            System.out.println("B");
        }

        System.out.println("C");
    }
}