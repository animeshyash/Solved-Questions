
// Importing the Scanner Class
import java.util.Scanner;

public class Problem_Eight {
    // Method that takes the Input String as Parameter and calculates the Total
    // Seconds.
    public static int timeInSeconds(String str) {
        int result = 0;
        // With the help of split function, we split the String into String Array on the
        // basis of Space.
        String[] arr = str.split(" ");

        // We take out the integer part and convert them into Integer and perform
        // Calculations on them.
        int hour = Integer.parseInt(arr[0].substring(0, arr[0].length() - 1));
        int min = Integer.parseInt(arr[1].substring(0, arr[1].length() - 1));
        int sec = Integer.parseInt(arr[2].substring(0, arr[2].length() - 1));
        result = (hour * 3600) + (min * 60) + sec;
        // Return the Total Seconds.
        return result;
    }

    public static void main(String[] args) {
        // Creating the Object of Scanner Class
        Scanner ob = new Scanner(System.in);

        // Taking the time as input from the User (Format:- 00h 00m 00s).
        System.out.println("Enter the Time : ");
        String time = ob.nextLine();

        // Printing the Output
        System.out.println("------- Output -------");
        System.out.println(timeInSeconds(time));

        // Closing the resources inorder to prevent the leakage warning.
        ob.close();
    }
}
