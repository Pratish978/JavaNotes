package CoreJava;

public class Practice1{

    public static void main(String[] args){

        System.out.println("Start");

        try{
            int x = 10/2;

            System.out.println("Try");
        }
        catch(Exception e){
            System.out.println("Catch");
        }
        finally{
            System.out.println("Finally");
        }

        System.out.println("End");
    }
}