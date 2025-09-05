import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numberToIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numberToIndexMap.containsKey(target - nums[i])) {
                int[] res = new int[2];
                res[0] = numberToIndexMap.get(target - nums[i]);
                res[1] = i;
                return res;
            } else {
                numberToIndexMap.put(nums[i], i);
            }
        }
        return new int[2];
    }
}