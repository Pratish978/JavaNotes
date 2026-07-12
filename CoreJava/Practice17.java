import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Practice17 {
    public static void main(String[] args) 
          throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student name: ");
        String name = scanner.nextLine();
        
        BufferedWriter bw=new BufferedWriter(
            new FileWriter("Pratish.txt",true)
        );
        bw.write(name);
        bw.newLine();
        bw.close();
        scanner.close();
    }
}

