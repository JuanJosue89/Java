//Juan J. Serrano - A00536227
import javax.swing.*;

public class IODialogs {
    public static void main(String[] args) {
        double a, b, res; //Variables que usamos
        String usrIn; //Donde se guardara el numero que escribamos

        usrIn = JOptionPane.showInputDialog("Entre la base numerica que usara: "); //Le pedimos el numero de la base al usuario
        a = Integer.parseInt(usrIn); //Se guarda el numero en la base
        usrIn = JOptionPane.showInputDialog("Entre la potencia numerica que usara: "); //Le pedimos el numero de la potencia
        b = Integer.parseInt(usrIn); //Se guarda el numero de la potencia
        res = Math.pow(a, b); //La formula que usaremos para elevar los valores dados

        System.out.println("La base es: " + a); //Se presenta el valor de la base en la pantalla
        System.out.println("La potencia es: " + b); //Se presenta el valor de la potencia en la pantalla
        JOptionPane.showMessageDialog(null, "El resultado es: " + res); //Se presenta el resultado
    }
}
