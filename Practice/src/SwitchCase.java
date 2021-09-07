import java.io.*;

public class SwitchCase {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escoja un numero del 1 al 3: ");
        int valor = Integer.parseInt(in.readLine());

        switch (valor)
        {
            case 1:
            {
                System.out.println("Selecciono el numero 1");
                break;
            }
            case 2: {
                System.out.println("Selecciono el numero 2");
                break;
            }
            case 3: {
                System.out.println("Selecciono el numero 3");
                break;
            }
            default:
            {
                System.out.println("Seleccione entre el 1 y el 3");
                break;
            }
        }
    }
}
