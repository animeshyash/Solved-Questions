
// Importing the Scanner Class
import java.util.Scanner;

public class Problem_Four {
    // Method that takes a String and checks if it has equal number of Upper as well
    // as Lower Case Letters
    public static boolean checkEquality(String str) {
        int lower = 0, upper = 0;
        // We iterate over string and count the number of lower and upper case alphabets
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch))
                lower++;
            else if (Character.isUpperCase(ch))
                upper++;
        }
        // Returns true or false depending on the answer.
        return upper == lower;
    }

    public static void main(String[] args) {
        // Creating the Object of Scanner Class
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter the String : ");
        // Taking the Input from the User
        String str = ob.nextLine();

        System.out.println("------- Output -------");
        // Here we check for Equality of lower and upper case letters
        if (checkEquality(str))
            System.out.println("The String has equal number of Upper and Lower Case letters");
        else
            System.out.println("The String does not have equal number of Upper and Lower Case letters");

        // Closing the resources inorder to prevent the leakage warning.
        ob.close();
    }
}
