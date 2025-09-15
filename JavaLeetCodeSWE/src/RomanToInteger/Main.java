package RomanToInteger;

public class Main {
    public static void main(String[] args) {
        String test1 = "III";
        String test2 = "LVIII";
        String test3 = "MCMXCIV";

        Solution solution = new Solution();
        System.out.println("Test 1: " + solution.romanToInt(test1));
        System.out.println("Test 2: " + solution.romanToInt(test2));
        System.out.println("Test 3: " + solution.romanToInt(test3));
    }
}
