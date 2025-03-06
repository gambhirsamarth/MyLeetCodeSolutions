import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        // [1,2,3,4,3,2,5]
        // 3
        int[] arr = {1, 2, 3, 4, 3, 2, 5};
        int k = 3;
        int[] results = resultsArray(arr, k);
        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i] + " ");
        }
    }

    public static int[] resultsArray(int[] nums, int k) {
        List<Integer> results = new ArrayList<>();
        int pointer = 0;
        int end = k;
        while (end <= nums.length) {
            boolean isConsecutive = true;
            for (int i = pointer; i < end; i++) {
                if (i < end - 1 && nums[i] + 1 != nums[i + 1]) {
                    results.add(-1);
                    isConsecutive = false;
                    break;
                }
            }
            if (isConsecutive) {
                results.add(nums[end - 1]);
            }
            pointer++;
            end++;
        }
        return results.stream().mapToInt(i -> i).toArray();
    }
}
