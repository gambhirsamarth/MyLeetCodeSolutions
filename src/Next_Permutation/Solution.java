import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;

        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                index = i - 1;
                break;
            }
        }

        if (index == -1) {
            reverse(0, nums.length - 1, nums);
            return;
        } else {
            for (int i = nums.length - 1; i >= index; i--) {
                if (nums[i] > nums[index]) {
                    nums[i] += nums[index];
                    nums[index] = nums[i] - nums[index];
                    nums[i] = nums[i] - nums[index];
                    break;
                }
            }
            reverse(index + 1, nums.length - 1, nums);
        }

    }

    public void reverse(int start, int end, int[] array) {
        while (start <= end) {
            array[start] += array[end];
            array[end] = array[start] - array[end];
            array[start] = array[start] - array[end];
            start++;
            end--;
        }
    }
}