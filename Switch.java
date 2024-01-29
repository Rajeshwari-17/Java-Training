import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a day
        System.out.print("Enter a day (1-7): ");
        
        // Read the user input as an integer
        int day = scanner.nextInt();
        String dayString;

        // Switch statement with int data type
        switch (day) {
            // Case
            case 1:
                dayString = "Monday";
                break;

            // Case
            case 2:
                dayString = "Tuesday";
                break;

            // Case
            case 3:
                dayString = "Wednesday";
                break;

            // Case
            case 4:
                dayString = "Thursday";
                break;

            // Case
            case 5:
                dayString = "Friday";
                break;

            // Case
            case 6:
                dayString = "Saturday";
                break;

            // Case
            case 7:
                dayString = "Sunday";
                break;

            // Default case
            default:
                dayString = "Invalid day";
        }

        // Close the scanner to prevent resource leak
        scanner.close();

        // Print the result
        System.out.println(dayString);
    }
}

