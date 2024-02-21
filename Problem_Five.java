
// Importing the Scanner Class
import java.util.Scanner;

public class Problem_Five {
    // Method takes an array as parameter and check for speciality of the array.
    public static boolean checkSpecial(int[][] arr) {
        int even_sum = 0, odd_sum = 0; // Variables to store the sum of even and odd elements.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] % 2 == 0)
                    even_sum += arr[i][j];
                else
                    odd_sum += arr[i][j];
            }
        }

        // Returns the result as boolean after we check if the sum is equal or not.
        return even_sum == odd_sum;
    }

    public static void main(String[] args) {
        // Creating the Object of Scanner Class
        Scanner ob = new Scanner(System.in);
        int[][] arr = new int[3][3];

        System.out.println("Enter the Values in Array : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Taking the Input for 3 x 3 array from the User
                arr[i][j] = ob.nextInt();
            }
        }

        System.out.println("------- Output -------");
        // Check if the array is special or not.
        if (checkSpecial(arr))
            System.out.println("Array is Special");
        else
            System.out.println("Array is not Special");

        // Closing the resources inorder to prevent the leakage warning.
        ob.close();
    }
}
