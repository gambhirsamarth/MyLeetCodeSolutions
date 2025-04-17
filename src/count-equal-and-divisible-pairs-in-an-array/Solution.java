import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int countPairs(int[] nums, int k) {
        HashMap<Integer, List<Integer>> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indexMap.computeIfAbsent(nums[i], x -> new ArrayList<>()).add(i);
        }
        int count = 0;
        for (List<Integer> indices : indexMap.values()) {
            for (int i = 0; i < indices.size(); i++) {
                for (int j = i + 1; j < indices.size(); j++) {
                    if ((indices.get(i) * indices.get(j)) % k == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}