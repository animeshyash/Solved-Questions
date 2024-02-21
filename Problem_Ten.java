
// Importing the Scanner Class
import java.util.Scanner;

public class Problem_Ten {
    // Method to find the sum of smallest and largest number in the array.
    public static int sum(int[] arr) {
        int smallest = Integer.MAX_VALUE; // Assigning the Integer.Max value to find the smallest number.
        int largest = Integer.MIN_VALUE; // Assigning the Integer.Min value to find the largest number.

        // Iterating over the Array and finding the Smallest and Largest Number from the
        // Array.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest)
                smallest = arr[i];
            if (arr[i] > largest)
                largest = arr[i];
        }
        // Returning the Sum of largest and smallest value from array.
        return smallest + largest;
    }

    public static void main(String[] args) {
        // Creating the Object of Scanner Class
        Scanner ob = new Scanner(System.in);
        // Taking the size of Array as input from the User.
        System.out.println("Enter the size of Array : ");
        int n = ob.nextInt();

        // Creating the Array of Input size.
        int[] arr = new int[n];
        // Taking the values of Array as input from the User.
        System.out.println("Enter the values in Array : ");
        for (int i = 0; i < n; i++)
            arr[i] = ob.nextInt();
        System.out.println("------- Output -------");
        System.out.println(sum(arr));

        // Closing the resources inorder to prevent the leakage warning.
        ob.close();
    }
}
