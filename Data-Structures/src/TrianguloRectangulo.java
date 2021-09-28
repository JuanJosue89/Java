import javax.swing.JOptionPane;

public class TrianguloRectangulo {
    public static void main(String[] args) {
        double R, X, Y;
        String input;

        for(int i = 0; i < 3; i++) {
            input = JOptionPane.showInputDialog("Entra el numero de uno de los catetos: ");
            X = Integer.parseInt(input);
            input = JOptionPane.showInputDialog("Entra el numero del segundo cateto: ");
            Y = Integer.parseInt(input);
            R = Math.sqrt((X * X) + (Y * Y));

            JOptionPane.showMessageDialog(null, "La hipotenusa del Triangulo Rectangulo es: " + R);
        }


    }
}
