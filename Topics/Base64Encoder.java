import java.util.Base64;

public class Base64Encoder {

    public static void main(String[] args) {
        // Sample string to encode
        String originalString = "Hello, World!";

        // Encode the string
        String encodedString = encodeString(originalString);

        // Print the results
        System.out.println("Original String: " + originalString);
        System.out.println("Encoded String: " + encodedString);
    }

    private static String encodeString(String input) {
        // Get encoder
        Base64.Encoder encoder = Base64.getEncoder();

        // Encode the string
        return encoder.encodeToString(input.getBytes());
    }
}
