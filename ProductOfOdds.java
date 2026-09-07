public class ProductOfOdds {
        public static void main(String[] args) { 
            // Initialize variables
            int product = 1;
            int number = 1;

            // Mutiply all odd integers from 1 to 15
            while(number <= 15) {
                product *= number; // Multiply the product by the current number
                number += 2; // Increment the number by 2 to get the next odd number
            }

            // Display the final product
            System.out.println("The product of all odd integers from 1 to 15 is: " + product);
        }
}