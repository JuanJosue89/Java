import java.io.*;
import java.sql.SQLOutput;

public class FirstMath {
    public static void main(String[] args)
    throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int ent1, ent2, sum;

        double real1, real2, cocient;

        System.out.println("Entre un numero entero: ");
        ent1 = Integer.valueOf(in.readLine()).intValue();
        System.out.println("Entre otro numero entero: ");
        ent2 = Integer.parseInt(in.readLine());
        sum = ent1 + ent2;
        System.out.println("Entero 1 + Entero 2 = " + sum);

        System.out.println("Entre un numero decimal: ");
        real1 = Double.valueOf(in.readLine()).doubleValue();
        System.out.println("Entre otro decimal: ");
        real2 = Double.valueOf(in.readLine()).doubleValue();
        cocient = real1 / real2;
        System.out.println("Decimal 1 / Decimal 2 = " + cocient);
    }
}
