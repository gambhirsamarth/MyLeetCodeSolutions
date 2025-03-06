class Solution {

    public static void main(String[] args) {
        // [9,12,5,10,14,3,10]
        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;
        Solution solution = new Solution();
        int[] result = solution.pivotArray(nums, pivot);
        for (int num : result) {
            System.out.println(num);
        }
    }

    public int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int pointer = 0;
        int pivotCount = 0;
        for (int num : nums) {
            if (num < pivot) {
                result[pointer] = num;
                pointer++;
            }
            if (num == pivot) pivotCount++;
        }
        for (int i = 0; i < pivotCount; i++) {
            result[pointer] = pivot;
            pointer++;
        }
        for (int num : nums) {
            if (num > pivot) {
                result[pointer] = num;
                pointer++;
            }
        }
        return result;
    }
}
