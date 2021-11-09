import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Circle myCircle = new Circle(); //Llamamos al primer constructor
        System.out.println(myCircle); //Imprimimos todas las variables y los valores del primer constructor
        Circle tuCircle = new Circle(); //Llamamos al segundo constructor
        System.out.println(tuCircle.setRadio()); //Llamamos la funcion SetRadio para que el valor del radio sea alterado
        System.out.println(tuCircle); //Imprime los valores con el nuevo valor de radio




    }
}
