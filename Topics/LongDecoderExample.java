public class LongDecoderExample {
    public static void main(String[] args) {
        // Encoded string
        String encodedLong = "12345";

        // Decode the Long
        long decodedLong = Long.decode(encodedLong);

        // Print the result
        System.out.println("Decoded Long: " + decodedLong);
    }
}
