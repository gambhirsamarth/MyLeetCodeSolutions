class Solution {
    public static int chalkReplacer(int[] chalk, int k) {
        long totalSum = 0;
        for (int j : chalk) {
            totalSum += j;
        }
        if (k % totalSum == 0) {
            return 0;
        }
        if (k > totalSum) {
            k = (int) (k % totalSum);
        }
        int i;
        for (i = 0; i < chalk.length; i++) {
            if (chalk[i] > k) return i;
            k -= chalk[i];
        }
        return i;
    }
}
