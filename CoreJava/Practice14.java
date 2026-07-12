import java.io.FileWriter;
import java.io.IOException;

public class Practice14 {

    public static void main(String[] args)
            throws IOException {

        FileWriter writer =
                new FileWriter("Student.txt");

        writer.write("Pratish");

        writer.close();

        System.out.println("Data Written");
    }
}