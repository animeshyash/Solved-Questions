
// Importing the Scanner and Arrays Class
import java.util.Arrays;
import java.util.Scanner;

public class Problem_Two {

    // Method to Sort the Array in Descending Order using Bubble Sort Technique.
    public static void sort(int[] arr) {
        int n = arr.length;
        int temp = 0; // Temporary variable to store value during swapping
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] < arr[j]) {
                    // Swap the Elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {
        // Creating the Object of Scanner Class
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter the Size of Array : ");
        // Taking the Input from the User
        int size = ob.nextInt();

        // Creating the Array of size given as the input by the user
        int[] arr = new int[size];

        System.out.println("Enter the Values in Array : ");

        // Taking the Array values from User.
        for (int i = 0; i < arr.length; i++)
            arr[i] = ob.nextInt();

        // Sorting using the sort method
        sort(arr);

        System.out.println("------- Output -------");
        System.out.println(Arrays.toString(arr));

        // Closing the resources inorder to prevent the leakage warning.
        ob.close();
    }
}
