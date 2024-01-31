package hashing.example;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class UniqueHashGenerators {
    public static String generateHash(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(input.getBytes());

        StringBuilder hexHash = new StringBuilder();
        for (byte b : hashBytes) {
            hexHash.append(String.format("%02x", b));
        }

        return hexHash.toString();
    }
    
	public static void main(String[] args) throws NoSuchAlgorithmException {
		Scanner sc = new Scanner(System.in);
		
        String input = sc.nextLine();
        System.out.println(input);
        String hash = generateHash(input);
        System.out.println("SHA-256 Hash: " + hash);
	

	}
}