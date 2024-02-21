
// Importing the Scanner Class
import java.util.Scanner;

public class Problem_Six {
    // Method to find total Interest Compounded Monthly.
    public static double interest(double p, double i, int m) {
        double result = 0.0;
        // Formula to calculate the Total Interest.
        result = p * (Math.pow(1 + (i / 100 / 12), m) - 1);
        // Returning the Output to the Main Method
        return result;
    }

    public static void main(String[] args) {
        // Creating the Object of Scanner Class
        Scanner ob = new Scanner(System.in);

        // Taking the required Inputs.
        System.out.println("Enter Principal Amount : ");
        double p = ob.nextDouble();
        System.out.println("Enter Interest Rate : ");
        double i = ob.nextDouble();
        System.out.println("Enter the Number of Months : ");
        int m = ob.nextInt();

        System.out.println("------- Output -------");
        // Passing values in interest method and calculating the output.
        System.out.println("Total Interest -> " + interest(p, i, m));

        // Closing the resources inorder to prevent the leakage warning.
        ob.close();
    }
}
