
// Importing the Scanner Class
import java.util.Scanner;

public class Problem_Seven {
    public static void main(String[] args) {
        // Creating the Object of Scanner Class.
        Scanner ob = new Scanner(System.in);

        // Taking the input of both the Integers.
        System.out.println("Enter the First Number : ");
        int num1 = ob.nextInt();
        System.out.println("Enter the Second Number : ");
        int num2 = ob.nextInt();

        // We are casting the Sum and Multiplication to long to prevent Potential
        // Overflow of Data.
        long sum = (long) num1 + num2;
        long mul = (long) num1 * num2;

        System.out.println("------- Output -------");
        // Checking and Printing the output according to the Overflow of Data.
        if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE)
            System.out.println("Sum of the above numbers results in Overflow");
        else
            System.out.println("Sum of the above numbers does not results in Overflow");

        if (mul > Integer.MAX_VALUE || mul < Integer.MIN_VALUE)
            System.out.println("Multiplication of the above numbers results in Overflow");
        else
            System.out.println("Multiplication of the above numbers does not results in Overflow");
        // Closing the resources inorder to prevent the leakage warning.
        ob.close();
    }
}
