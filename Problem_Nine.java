
// Importing the Scanner Class, Arrays Class and Comparator Class.
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Problem_Nine {
    // Method to Compare the Strings in Array, first on the basis of Length of word
    // and then
    // in Alphabetical Order
    public static void sortArray(String[] arr) {
        // Here we are overriding the inbuilt Compare method used by the Arrays.sort.
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                // Comparing the Length of Words First.
                int lengthCompare = Integer.compare(str1.length(), str2.length());
                if (lengthCompare != 0) {
                    return lengthCompare;
                }
                // If lengths of words are equal then we are comparing it on the basis of
                // Alphabets.
                return str1.compareTo(str2);
            }
        });
    }

    public static void main(String[] args) {
        // Creating the Object of Scanner Class
        Scanner ob = new Scanner(System.in);
        // Taking the size of Array as input from the User.
        System.out.println("Enter the size of Array : ");
        int n = ob.nextInt();

        // Creating the Array of Input size.
        String[] arr = new String[n];
        // Taking the values of Array as input from the User.
        System.out.println("Enter the values in Array : ");
        for (int i = 0; i < n; i++)
            arr[i] = ob.next();

        // Sorting the Array as required.
        sortArray(arr);

        // Printing the Resultant Output
        System.out.println("------- Output -------");
        System.out.println(Arrays.toString(arr));

        // Closing the resources inorder to prevent the leakage warning.
        ob.close();
    }
}
