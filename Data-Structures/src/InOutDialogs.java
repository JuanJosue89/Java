import javax.swing.*;
public class InOutDialogs {
    public static void main(String[] args) {
        String strFirstNumber, strSecondNumber;
        double firstNumber, secondNumber, sum;

        strFirstNumber = JOptionPane.showInputDialog("First Number: ");
        firstNumber = Double.parseDouble(strFirstNumber);
        strSecondNumber = JOptionPane.showInputDialog("Second Number: ");
        secondNumber = Double.parseDouble(strSecondNumber);
        sum = firstNumber + secondNumber;
        JOptionPane.showMessageDialog(null, "The sum is " + sum, "Operations Results", JOptionPane.PLAIN_MESSAGE);
    }
}
