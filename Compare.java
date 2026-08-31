import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        // Create Scanner object to get input from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        // Compare the two integers and display the larger one
        if (number1 > number2) {
            System.out.printf("%d is larger%n", number1);
        } else if (number2 > number1) {
            System.out.printf("%d is larger%n", number2);
        } else {
            System.out.println("These numbers are equal");
        }
    }
}
