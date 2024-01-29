import java.util.*;
import java.util.Scanner;
public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number;
        System.out.println("Enter a number");
        number = sc.nextInt();
        long factorialResult = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorialResult);
    }

    // Function to calculate factorial using recursion
    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}

