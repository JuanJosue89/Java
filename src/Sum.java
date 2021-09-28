import java.util.Scanner;


public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value1, value2, sum;

        System.out.println("Enter the first value: ");
        value1 = input.nextDouble();
        System.out.println("Enter the second value: ");
        value2 = input.nextDouble();

        sum = value1 + value2;
        System.out.println(value1 + " + " + value2 + " = " + sum);
    }
}
