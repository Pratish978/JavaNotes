import java.io.*;

public class Practice15 {

    public static void main(String[] args)
            throws Exception {

        BufferedReader br =
            new BufferedReader(
                new FileReader("Java.txt")
            );

        String line = br.readLine();

        System.out.println(line);

        br.close();
    }
}