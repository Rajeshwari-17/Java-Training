import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateConversion {
    public static void main(String[] args) {
        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for date and time
        System.out.print("Enter date and time (dd/MM/yyyy HH:mm): ");
        String userInput = scanner.nextLine();

        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Parse the user input
        LocalDateTime localDateTime = LocalDateTime.parse(userInput, formatter);

        // Convert to Unix Timestamp (milliseconds)
        long unixTimestamp = localDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        System.out.println("Unix Timestamp: " + unixTimestamp);

        // Convert to UTC
        ZonedDateTime utcDateTime = localDateTime.atZone(ZoneId.of("UTC"));
        System.out.println("UTC: " + utcDateTime.format(formatter));

        // Convert UTC back to Local timestamp (IST)
        ZonedDateTime istDateTime = utcDateTime.withZoneSameInstant(ZoneId.systemDefault());
        System.out.println("Local timestamp (IST): " + istDateTime.format(formatter));

        // Close the Scanner
        scanner.close();
    }
}
