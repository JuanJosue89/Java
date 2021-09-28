// Juan J. Serrano Rosado - A00536227//

import java.util.Scanner;

public class primerPrograma2 { // Nuestra clase sera publica //
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Estamos declarando un nuevo Scanner input para que pueda leer el input por System.in //
        double valor1, valor2, suma; // Las variables que usaremos en el programa //

        System.out.println("Entre valor 1: "); // El programa pide el primer valor //
        valor1 = input.nextDouble(); // Escribiremos el valor 1 y lo leera mediante el input scanner //
        System.out.println("Entre valor 2: "); // El programa pide el segundo valor //
        valor2 = input.nextDouble(); // Escribiremos el valor 2 y lo leera mediante el input scanner //
        suma = valor1 + valor2; // El programa hace la operacion aritmetica para darle un valor a la variable suma //
        System.out.println(valor1 + " + " + valor2 +" = " + suma); // El programa escribira en la pantalla los valores 1 y 2 junto //
        // con los diferentes signos y tambien escribira la suma. //
    }
}
