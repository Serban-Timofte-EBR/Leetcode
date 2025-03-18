import java.util.Arrays;

public class Main {
    public static int removeElement(int[] nums, int val) {
        int slowPointer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[slowPointer++] = nums[i];
            }
        }

        return slowPointer;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = removeElement(nums1, val1);
        System.out.println("Output: " + k1 + ", nums = " + Arrays.toString(Arrays.copyOf(nums1, k1)));
        // Expected Output: 2, nums = [2, 2]

        // Test Case 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int k2 = removeElement(nums2, val2);
        System.out.println("Output: " + k2 + ", nums = " + Arrays.toString(Arrays.copyOf(nums2, k2)));
        // Expected Output: 5, nums = [0, 1, 3, 0, 4] (Order doesn't matter)

    }
}