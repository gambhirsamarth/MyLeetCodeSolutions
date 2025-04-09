import java.util.HashSet;
import java.util.Set;

class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int number : nums) {
            if (number < k) return -1;
            set.add(number);
        }
        return set.contains(k) ? set.size() - 1 : set.size();
    }
}