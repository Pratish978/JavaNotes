import java.io.BufferedReader;
import java.io.FileReader;

public class Practice16 {

    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(
                        new FileReader("Java.txt")
                );

        String line;

        while ((line = br.readLine()) != null) {

            System.out.println(line);

        }

        br.close();
    }
}