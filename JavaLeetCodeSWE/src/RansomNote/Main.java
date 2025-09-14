package RansomNote;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.canConstruct("a", "b"));
        System.out.println(solution.canConstruct("aa", "ab"));
        System.out.println(solution.canConstruct("aa", "aab"));

        System.out.println();

        System.out.println(solution.canConstruct2("a", "b"));
        System.out.println(solution.canConstruct2("aa", "ab"));
        System.out.println(solution.canConstruct2("aa", "aab"));
    }
}
