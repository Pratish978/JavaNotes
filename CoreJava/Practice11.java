interface Demo{
    void show();
}

public class Practice11{

    public static void main(String[] args){

        Demo d = () -> System.out.println("Hello");

        d.show();
    }
}