import javax.swing.JOptionPane;

public class TriangleRectangle {
    public static void main(String[] args) {
        double R, X, Y;
        String input;

        for (int i = 0; i < 3; i++) {
            input = JOptionPane.showInputDialog("Enter the first side of the triangle: ");
            X = Integer.parseInt(input);
            input = JOptionPane.showInputDialog("Enter the seconde side of the triangle: ");
            Y = Integer.parseInt(input);
            R = Math.sqrt((X * X) + (Y * Y));

            JOptionPane.showMessageDialog(null, "The hypotenuse is: " + R);
        }
    }
}
