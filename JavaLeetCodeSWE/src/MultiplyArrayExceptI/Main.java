package MultiplyArrayExceptI;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,2,3,4};
        int[] pref = solution.productExceptSelf(arr);

        for(int i : pref){
            System.out.println(i);
        }
    }
}
