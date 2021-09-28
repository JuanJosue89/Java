import java.util.Scanner;

public class MultipleOf {
    public static void main(String[] args) {
        Scanner usrIn = new Scanner(System.in);
        int num_a = 0, multipleOf = 0, num_b;
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the multiple you want to use: ");
            multipleOf = usrIn.nextInt();

            switch (multipleOf) {
                case 2:
                    System.out.println("You chose multiple of 2");
                    System.out.println("Enter the number you want to begin with: ");
                    num_a = usrIn.nextInt();
                    System.out.println("Enter the number you want to finish with: ");
                    num_b = usrIn.nextInt();

                    for (int j = num_a; j <= num_b; j++) {
                        if(num_a % 2 == 0) {
                            System.out.println(j);
                        }
                    }
                    break;

                case 3:
                    System.out.println("You chose multiple of 3");
                    System.out.println("Enter the number you want to begin with: ");
                    num_a = usrIn.nextInt();
                    System.out.println("Enter the number you want to finish with: ");
                    num_b = usrIn.nextInt();

                    for (int j = num_a; j <= num_b; j++) {
                        if(num_a % 3 == 0) {
                            System.out.println(j);
                        }
                    }
                    break;
            }

        }
    }

}
