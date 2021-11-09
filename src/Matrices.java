import javax.swing.*;
import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        int[][] matriz = new int[20][20]; //Matriz que almacenara el resultado
        int[][] matrizA; //Donde estara los numeros de la primera matriz
        int[][] matrizB; //Donde estaran los numeros de la segunda matriz
        int filasA, filasB, colA, colB, valorA, valorB, i, j; //Las variables de enteros
        Scanner sc = new Scanner(System.in); //El scanner que leera los valores entrados


        System.out.println("Cuantas filas tendra la matriz A?: "); //Pedira las filas de la primera matriz
        filasA = sc.nextInt(); //Variable donde se guardara el valor
        System.out.println("Cuantas columnas tiene la matriz A?: "); //Pedira las columnas de la primera matriz
        colA = sc.nextInt(); //Guardara la variable del valor de la columna
        matrizA = new int[filasA][colA]; //Iniciando la variable de la matrizA
        System.out.println("La matriz A tiene " + filasA + " filas y " + colA + " columnas"); //Imprimira los valores entrados

        System.out.println("Los valores de matriz A"); //Pedira los valores de la matriz
        for(i = 0; i < matrizA.length; i++) { //Pedira cada valor hasta que sea menos del largo del numero de matriz A
            for (j = 0; j < matrizA.length; j++) {  //Pedira cada valor hasta que sea menos del largo del numero de matriz A
                System.out.println("Escribe los valores " + i + ", " + j + ": "); //Leera y guardara los valores
                matrizA[i][j] = sc.nextInt() ; //Variable donde se guardara los valores
            }
        }

        System.out.println("Cuantas filas tendra la matriz B?: "); //Pedira los valores de la fila de la matriz b
        filasB = sc.nextInt(); //Guardara los valores de la fila
        System.out.println("Cuantas columnas tiene la matriz B?: "); //Pedira los valores de la columna de b
        colB = sc.nextInt(); //Guardara los valores de la columna
        matrizB = new int[filasB][colB]; //Inicia la variable de matriz B
        System.out.println("La matriz B tiene " + filasB + " filas y " + colB + " columnas"); //Imprimira los valores entrados

        System.out.println("Los valores de matriz B"); //Pedira los valores de B
        for (i = 0; i < matrizB.length; i++) { //Pedira cada valor hasta que sea menos del largo del numero de matriz B
            for (j = 0; j < matrizB.length; j++) { //Pedira cada valor hasta que sea menos del largo del numero de matriz A
                System.out.println("Escribe el valor " + i + ", " + j + " : "); //Leera y guardara los valores
                matrizB[i][j] = sc.nextInt(); //Variable donde se guardaran los valores
            }
        }

        for (i = 0; i < matrizA.length; i++) { //Leera los valores dentro de la matriz de A
            for (j = 0; j < matrizB.length; j++) { //Leera los valores dentro de la matriz de B
                matriz[i][j] = matrizA[i][j] + matrizB[i][j]; //Sumara los valores de ambas matrices
            }
        }
        System.out.println("El resultado de la suma de la matriz es: "); //Imprimira los valores de la suma
        for (i = 0; i < matrizA.length; i++) { //Leera los vaores de la matriz a
            for (j = 0; j < matrizB.length; j++) { //Leera los valores de la matriz b
                System.out.println(matriz[i][j] + " "); //Mostrara los valores de la suma de la matriz a y b
            }
        }

    }
}
