public class Main {
    public static int removeDuplicates(int[] nums) {
        int currentIndexOfFinalArray = 0;
        int currentValue = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != currentValue) {
                nums[++currentIndexOfFinalArray] = nums[i];
                currentValue = nums[currentIndexOfFinalArray];
            }
        }

        return currentIndexOfFinalArray + 1;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}