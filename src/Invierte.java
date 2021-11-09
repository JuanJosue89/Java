import java.util.Scanner;

public class Invierte {
    public static void main(String[] args) {
        int a, i, b, aux; //Variables que usaremos
        Scanner sc = new Scanner(System.in); //El scanner que leera el valor
        int array[] = {1, 5, 7, 12}; //El primer array

        int inv[] = new int[array.length]; //Se lee el largo del array
        System.out.println("El array original es: "); //En la pantalla sale cual es el array original
        for(int k = 0; k < array.length; k++) { //Leera cada elemento dentro del array
            System.out.println(array[k]); //Imprimira los elementos
        }
        System.out.println("El array invertido es: "); //Saldra el array invertido
        for(int m = array.length - 1, n = 0; m >= 0; m--, n++) { //Lee cada elemento dentro del array y lo pone orden invertido
            inv[n] = array[m]; //Los valores anteriores, se guardan en esta nueva variable
            System.out.println(inv[n]); //Imprime los valores en orden invertido
        }

        int array2[] = new int[5]; //Segundo Array
        System.out.println("Veamos el array que quieres ingresar"); //Sale en la pantalla
        System.out.println("Ingresa el tamaño del array: "); //Pide en la pantalla el tamaño del array
        a = sc.nextInt(); //Guardamos el valor ingresado en esta variable
        for (i = 0; i < a; i++) { //Leera los elementos que entraran hasta que llegue al número ingresado
            System.out.println("Valor: " + (i + 1)); //Sale el valor que esta pidiendo del array
            array2[i] = sc.nextInt(); //Lee el valor que entramos en el array
        }

        System.out.println("Segundo arreglo sin invertir: "); //Imprimira en pantalla el array sin invertir
        for(int j = 0; j < a; j++) { //Leera los elemetos dentros del array que se entraron
            System.out.println(array2[j]); //Imprimira los elementos dentro del array
        }
        b = a; //Ponemos los valores de a en b

        for(i = 0; i <= b /2; i++) { //Lee los valores hasta la mitad
            aux = array2[i]; //Cambiamos una variable por otra
            array2[i] = array2[b - 1]; //Le restamos a la variable los valores que le dimos
            array2[b - 1] = aux; //Cambiamos variable
            b--; //Vamos en reversa
        }

        System.out.println("\nEl array son valores invertidos: "); //Presenta los valores invertidos
        for(i = 0; i < a; i++) { //Lee los valores
            System.out.println(array2[i]); //Imprime los valores
        }

    }
}
