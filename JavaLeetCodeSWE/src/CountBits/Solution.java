package CountBits;

public class Solution {
    public int countOnes(int x) {
        int counter = 0;
        while(x > 0) {
            if((x & 1) == 1) {
                counter++;
            }
            x >>= 1;
        }
        return counter;
    }

    public int[] countBits(int n) {
        int[] array = new int[n+1];

        for(int i=1; i <= n; i++) {
            array[i] = array[i >> 1] + (i&1);
        }

        return array;
    }
}
