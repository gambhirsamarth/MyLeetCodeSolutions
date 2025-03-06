class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int num : nums) {
            if (num != 0) {
                queue.add(num);
            } else {
                count++;
            }
        }
        int pointer = 0;
        while (pointer < nums.length) {
            if (!queue.isEmpty()) {
                nums[pointer] = queue.poll();
            } else {
                nums[pointer] = 0;
            }
            pointer++;
        }
    }
}
