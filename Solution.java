import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int removeElement(ArrayList<Integer> nums, int val) {
        int k = 0; // Initialize the pointer for overwriting

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) != val) {
                nums.set(k++, nums.get(i));
            }
        }

        return k; // k represents the number of elements not equal to val
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage:
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 2, 2, 3)); // Replace this with your array
        int val = 3; // Replace this with the value to be removed

        int result = solution.removeElement(nums, val);

        // Output the modified array
        System.out.print("Modified Array: [");
        for (int i = 0; i < result; ++i) {
            System.out.print(nums.get(i));
            if (i < result - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Output the number of elements not equal to val
        System.out.println("Number of elements not equal to " + val + ": " + result);
    }
}


