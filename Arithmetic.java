import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        // Create Scanner object to get input from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        System.out.print("Enter third integer: ");
        int number3 = input.nextInt();

        // Calculate sum, average, product
        int sum = number1 + number2 + number3;
        int avg = sum / 3;
        int product = number1 * number2 * number3;
        
        // Determine the smallest number
        int smallest = number1;
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        } 

        // Determine the largest number
        int largest = number1;
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }   
        
        // Display Results
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %d%n", avg);
        System.out.printf("Product: %d%n", product);
        System.out.printf("Smallest: %d%n", smallest);
        System.out.printf("Largest: %d%n", largest);
    }
}
