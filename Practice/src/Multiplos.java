import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        int num;
        boolean multiploTres = false;
        Scanner numero = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Entra un numero: ");
            num = numero.nextInt();
            if (num % 3 == 0)
            {
                multiploTres = true;
            }

            if (multiploTres == false)
            {
                System.out.println("No es multiplo de 3");
            }
            else {
                System.out.println("Es un multiplo de 3");
            }
        }
    }
}
