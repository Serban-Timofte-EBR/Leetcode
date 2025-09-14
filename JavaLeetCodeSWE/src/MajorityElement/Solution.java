package MajorityElement;

import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> inventory = new HashMap<>();
        for(int num : nums) {
            int counter = inventory.getOrDefault(num, 0);
            inventory.put(num, counter + 1);
            if (counter + 1 > nums.length / 2) {
                return num;
            }
        }

        return -1;
    }
}
