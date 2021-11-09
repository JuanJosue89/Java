import java.util.Scanner;

public class Circle {
    double radius, area, perimetro; //Variables a usar
    Scanner sc = new Scanner(System.in); //Variable donde se guardara el nuevo valor del radio

    public Circle() {
        radius = 5; //Valor del primer constructor
    }

    public double setRadio() {
        System.out.println("El radio que desea es: "); //Le pedimos al usuario el valor de radio para el segundo consructor
        return radius = sc.nextDouble(); //donde se almacena el segundo valor

    }

    public Circle(double r) {
        radius = setRadio(); //Cuando se llame la funcion SetRadio nos aseguramos que el valor del radio sea igual a la variable
    }

    public double getArea() {
        return area; //Muestra el valor del area
    }

    public double setArea() {
        return area = radius * radius * Math.PI; //Formula del area
    }

    public double getPerimetro() {
        return perimetro; //Muestra el valor del perimetro
    }

    public double setPerimetro() {
        return perimetro = 2 * Math.PI * radius;//Formula del perimetro
    }

    public String toString() {
        return ("El radio es: " + radius + "\nEl area es: " + setArea() + "\nEl perimetro es: " + setPerimetro()); //Envia los datos de las variables
    }
}
