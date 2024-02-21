
// Importing the Scanner Class
import java.util.Scanner;

public class Problem_Three {
    // Method to check if the Number is Prime or Not.
    public static boolean checkPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count > 2)
            return false;
        return true;
    }

    public static void main(String[] args) {
        // Creating the Object of Scanner Class
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the Number :");

        // Taking the Input from the User
        int n = ob.nextInt();

        System.out.println("------- Output -------");
        if (n <= 1)
            System.out.println("The Above Number is Neither Prime nor Composite");
        // Check if input Number is Prime or Not.
        else if (checkPrime(n))
            System.out.println("Its a Prime Number");
        else
            System.out.println("Its not a Prime Number");

        // Closing the resources inorder to prevent the leakage warning.
        ob.close();
    }
}
