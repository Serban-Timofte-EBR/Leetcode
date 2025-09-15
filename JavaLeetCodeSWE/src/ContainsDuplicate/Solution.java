package ContainsDuplicate;

import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> inventory = new HashSet<>();
        for (int num : nums) {
            if (inventory.contains(num)) {
                return true;
            }
            inventory.add(num);
        }
        return false;
    }
}
