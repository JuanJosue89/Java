// Juan J. Serrano Rosado - A00536227 //
import java.io.*;
public class Aritmetica { // Clase Publica
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //Declarando el Buffer que leera el input
        int entero1, entero2, base, exponente, suma, resta, multi, power; // las diferentes variables que usaremos
        double real1, real2, cociente; //Variable de cociente

        System.out.println("Entre un numero entero: "); //Pide el entero 1 en la pantalla
        entero1 = Integer.valueOf(in.readLine()).intValue(); //Lee el numero para el entero 1
        System.out.println("Entre otro numero entero: ");//Pide el entero 2 en la pantalla
        entero2 = Integer.parseInt(in.readLine()); // lee el entero
        suma = entero1 + entero2; // operacion de suma
        multi = entero1 * entero2; //operacion de multiplicacion
        resta = entero1 - entero2; //operacion de resta
        System.out.println("El resultado de la suma de " + entero1 + " + " + entero2 + " = " + suma); //En la pantalla pone los dos numeros y el resultado de suma
        System.out.println("El resultado de la resta de " + entero1 + " - " + entero2 + " = " + resta); //Pone los numeros que puso el usuario y su resta
        System.out.println("El resultado de la multiplicacion de " + entero1 + " * " + entero2 + " = " + multi); //Pone en pantalla los numeros que el usuario uso y el resultado de la multiplicacion de ellos

        System.out.println("Entre un numero real: "); //pide el numero real
        real1 = Double.valueOf(in.readLine()).doubleValue(); //lee el numero real
        System.out.println("Entre otro numero real: "); //pide otro numero real
        real2 = Double.valueOf(in.readLine()).doubleValue(); //lee el otro numero real
        cociente = real1 / real2; //realiza la division
        System.out.println(real1 + " + " + real2 + " = " + cociente); //presenta los dos numeros puestos por el usuario y el resultado

        System.out.println("Entre el numero a elevar: "); //pide un numero base
        base = Integer.valueOf(in.readLine()).intValue(); //lee el numero
        System.out.println("Entre el exponente para elevar el numero: "); //pide el numero que se usara como exponente
        exponente = Integer.valueOf(in.readLine()).intValue(); //lee el exponente
        power = (int)Math.pow(base, exponente); //realiza la operacion de elevar el numero base al exponente
        System.out.println(base + " ^ " + exponente + " = " + power); // presenta los numeros que el usuario uso y su resultado

    }
}
