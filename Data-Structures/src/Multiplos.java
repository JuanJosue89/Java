import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner usrIn = new Scanner(System.in); // La variable que leera el input
        int num_a = 0, multiplo = 0, num_b = 0; // Las variables que se usaran
        Scanner a = new Scanner(System.in); // Leera el input del primer numero
        Scanner b = new Scanner(System.in); // Leera el input del numero final

        for (int i = 0; i < 3; i++) { // El for loop repetira el programa 3 veces
            System.out.println("Entre el multiplo: "); //Pide el input del usuario
            multiplo = usrIn.nextInt(); // Lee y guarda el numero con Scanner

            switch(multiplo) { // Condicional que usamos
                case 2: // Selecciona el numero 2
                    System.out.println("Usted escogio el multiplo 2."); // Le deja saber al usuario el numero que escogio
                    System.out.println("Entre numero inicial: "); // Le pide el num inicial
                    num_a = a.nextInt(); // Lee y guarda el num a
                    System.out.println("Entre numero final: "); // Le pide el num final
                    num_b = b.nextInt(); // Lee y guarda el num b

                    for (int j = num_a; j <= num_b; j++) // Este for loop es para ver cuales num estan entre num a y num b
                        if (j % 2 == 0) { // Nos dice cuales de esos numeros son divisibles por 2
                            System.out.println(j); // Imprime los numeros
                        }
                    break;
                case 3: // Selecciona el num 3
                    System.out.println("Usted escogio el multiplo 3."); //Le deja ssaber al usuario el num que escogio
                    System.out.println("Entre numero inicial: "); //Entra el num inicial de num a
                    num_a = a.nextInt(); // Lee y guarda el num a
                    System.out.println("Entre numero final: "); // Pide el num b
                    num_b = b.nextInt(); // Lee y guarda el num b

                    for (int j = num_a; j <= num_b; j++) // Busca los valores entre el num inicial y num final
                        if (j % 3 == 0) { // Nos dice cuales de esos numeros son divisibles por 3
                            System.out.println(j); // Imprime los numeros
                        }
                    break;
                default:
                    System.out.println("El numero debe ser entre 2 y 3"); //Le deja saber al usuario que solo puede entrar un multiplo entre 2 y 3
                    break;
            }
        }
    }
}