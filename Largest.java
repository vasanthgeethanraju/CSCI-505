import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        // Create Scanner object to get input from the user
        Scanner input = new Scanner(System.in);

        // Initialize variables
        int counter = 1; 

        System.out.print("Enter first integer: ");
        int number = input.nextInt();

        int largest = number;

        // Read and process the remaining integers
        while (counter < 10) {
            System.out.print("Enter next integer: ");
            number = input.nextInt();
            if (number > largest) {
                largest = number;
            }  
            counter += 1;
        } 
        
        // Display the largest number
        System.out.println("The largest number is: " + largest);
    }
}