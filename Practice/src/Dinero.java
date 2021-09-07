import java.util.*;
public class Dinero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variable que contendra el valor a devolver
        double importe = 0;
        do {
            try {
                System.out.println("Ingresa el cambio a devolver: ");
                importe = sc.nextDouble();
            }catch (Exception e) {
                System.out.println("Introduciste un dato por error");
                System.out.println("");
                sc.nextLine();
            }
        }
        while (importe <= 0);

        calcular(importe);
    }

    public static void calcular(double importe) {
        // Indicamos todas las monedas posibles
        double [] monedas = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.20, 0.10, 0.05, 0.02, 0.01};
        // Creamos un array con 0 de longitud igual a la cantidad de monedas
        // Este array contendra las monedas a devolver

        double [] devolver = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        // Recorremos todas las monedas
        for (int i = 0; i < monedas.length; i++)
        {
            // Si el importe es actual a la moneda
            if (importe >= monedas[i])
            {
                // Obtenemos cantidas de monedas
                devolver[i] = Math.floor(importe/monedas[i]);

                // Actualizamos el valor del importe que nos queda por dividir
                importe = importe - (devolver[i] * monedas[i]);

            }
        }

        // Loop para mostrar el resultado
        for (int i = 0; i < monedas.length; i++)
        {
            if (devolver[i] > 0)
            {
                if (monedas[i] > 2)
                {
                    System.out.println("Hay " + devolver[i] + "billetes de: " + monedas[i] + " Euros");
                }else {
                    System.out.println("Hay " + devolver[i] + "monedas de: " + monedas[i] + " Euros");
                }
            }
        }

    }
}
