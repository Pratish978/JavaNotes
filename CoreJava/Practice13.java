import java.io.File;
import java.io.IOException;

public class Practice13 {

    public static void main(String[] args)
            throws IOException {

        File file = new File("Java.txt");

        file.createNewFile();

        System.out.println("File Created");
    }
}