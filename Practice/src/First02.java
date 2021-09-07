import java.io.*;

public class First02 {
    public static void main(String[] args)
        throws IOException {
            BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));

            String name;
            System.out.println("Enter your name: ");
            name = myReader.readLine();
            System.out.println("Your name is " + name);

    }
}
