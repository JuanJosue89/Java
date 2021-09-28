import java.util.*;

public class Dinero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variable que contendra el valor a devolver

        double importe = 0;
        do {
            try {
                System.out.println("Ingresa el cambio a devolver: ");
                importe = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Escribiste un dato erroneo");
                System.out.println("");
                sc.nextLine();
            }
        }
        while (importe <= 0);
        calcular(importe);
        }

    public static void calcular(double importe) {
        // Todas las monedas posibles
        double [] monedas = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        // Todas las monedas a devolver
        double [] devolver = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        // Recorremos todas las monedas
        for (int i = 0; i < monedas.length; i++){
            // Si el importe es mayor a la moneda
            if (importe >= monedas[i]){
                // Obtenemos cantidad de monedas
                devolver[i] = Math.floor(importe/monedas[i]);
                // Actualizamos el valor del importe que nos queda por dividir
                importe = importe - (devolver[i] * monedas[i]);
            }
        }
        // Loop (Bucle) para ver el resultado
        for (int i = 0; i < monedas.length; i++){
            if (devolver[i] > 0){
                if (monedas[i] > 2){
                    // Indicamos que es un billete
                    System.out.println("Hay " + devolver[i] + " billetes de " + monedas[i] + " Euros");
                } else {
                    // Indicamos que es una moneda
                    System.out.println("Hay " + devolver[i] + " monedas de " + monedas[i] + " Euros");
                }
            }
        }
    }
    }

