import java.util.Scanner;
public class Suma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor1, valor2, suma;

        System.out.println("Entre el primer valor: ");
        valor1 = input.nextDouble();
        System.out.println("Entre el segundo valor: ");
        valor2 = input.nextDouble();
        suma = valor1 + valor2;

        System.out.println("La suma de " + valor1 + " + " + valor2 + " es igual a " + suma);
    }
}
