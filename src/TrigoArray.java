import javax.swing.*;
public class TrigoArray {
    public static void main(String[] args) {
        final double pi = 3.1415926535897932384626433832795;
        double table [][] = new double [361][3], angleRads, result;
        String strAngle, functName;
        int angleDeg, i;

        for(angleDeg = 0; angleDeg <= 360; angleDeg++) {
            angleRads = angleDeg * pi / 180d;
            table[angleDeg] [0] = Math.sin(angleRads);
            table[angleDeg] [1] = Math.cos(angleRads);
            table [angleDeg] [2] = Math.tan(angleRads);
        }
        strAngle = JOptionPane.showInputDialog("Enter angle (degrees): ");
        functName = JOptionPane.showInputDialog("Enter function (Sin/Cos/Tan): ");
        angleDeg = Integer.parseInt(strAngle);
        if (functName.equals("sin")) {
            result = table[angleDeg][0];
        }
        else if (functName.equals("cos")) {
            result = table[angleDeg][1];
        }
        else if (functName.equals("tan")) {
            result = table[angleDeg][2];
        }
        else {
            result = 0;
            functName = "unknown";
        }

        JOptionPane.showMessageDialog(null, functName + "(" + angleDeg + ") = " + result, "Trigonometric Functions", JOptionPane.PLAIN_MESSAGE );
    }
}
