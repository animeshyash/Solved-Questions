
// Importing the Scanner Class
import java.util.Scanner;

public class Problem_One {
    public static void main(String[] args) {
        // Creating the Object of Scanner Class
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter the value of N :");

        // Taking the Input from the User
        int n = ob.nextInt();
        System.out.println("-------- Output ---------");

        // Using Nested loop to print the Pattern
        // Outer Loop for the Number of Rows
        // Inner Loop for the Printing
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        // Closing the resources inorder to prevent the leakage warning.
        ob.close();
    }
}