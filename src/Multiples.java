import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        int num;
        boolean multipleOfThrees = false;
        Scanner numero = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un numero: ");
            num = numero.nextInt();
            if(num % 3 == 0){
                multipleOfThrees = true;
            }
        }
        if(multipleOfThrees==false){
            System.out.println("No se introdujeron multiplos de (3).");
        }
        else{
            System.out.println("Hay al menos un multiplo de (3).");
        }
    }
}
