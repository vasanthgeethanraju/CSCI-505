import java.util.Scanner;

public class StringComparator {

    public static void main(String[] args) {
        // Create Scanner object to get input from the user
        Scanner input = new Scanner(System.in);

        // Get the first string from the user
        System.out.print("Enter first String: ");
        String str1 = input.nextLine();

        // Get the second string from the user
        System.out.print("Enter second String: ");
        String str2 = input.nextLine();

        // Compare the two strings using compareTo
        int result = str1.compareTo(str2);

        // Display the comparison result
        if (result < 0) {
            System.out.println(str1 + " is less than " + str2);
        } else if (result > 0) {
            System.out.println(str1 + " is greater than " + str2);
        } else {
            System.out.println(str1 + " is equal to " + str2);
        }
    }
}