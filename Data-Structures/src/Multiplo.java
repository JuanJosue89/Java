import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        int num;
        boolean multiploTres = false;
        Scanner numero = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca un numero: ");
            num = numero.nextInt();
            if(num % 3 == 0) {
                multiploTres = true;
            }
        }
        if (multiploTres == false) {
            System.out.println("No se introdujeron multiplos de 3");
        } else {
            System.out.println("Hay al menos un multiplo de 3");
        }
    }
}
