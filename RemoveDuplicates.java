import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input elements of the sorted array
        System.out.println("Enter the sorted array elements:");
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        // Remove duplicates in-place and get the number of unique elements
        int uniqueCount = removeDuplicates(nums);

        // Display the unique elements and the count
        System.out.print("Unique elements: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nNumber of unique elements: " + uniqueCount);
    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueCount = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount++] = nums[i];
            }
        }

        return uniqueCount;
    }
}
