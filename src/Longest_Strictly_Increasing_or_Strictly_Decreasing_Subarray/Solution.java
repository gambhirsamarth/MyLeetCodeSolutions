
/*
 * Approach:
 *
 * 1. We are given an array of integers `nums` and need to find the length of the longest subarray
 *    that is either strictly increasing or strictly decreasing.
 *
 * 2. To solve this, we will iterate through the array while keeping track of the lengths of the
 *    current increasing and decreasing subarrays.
 *
 * 3. We maintain two variables (`currentIncreasingLength` and `currentDecreasingLength`) to store
 *    the length of the ongoing increasing or decreasing subarray.
 *    Additionally, we keep track of the maximum length of increasing and decreasing subarrays
 *    (`increasingLength` and `decreasingLength`).
 *
 * 4. As we go through the array:
 *    - If the current element is less than the next one, we increment the length of the increasing subarray.
 *      We reset the decreasing subarray length since it no longer continues.
 *    - If the current element is greater than the next one, we increment the length of the decreasing subarray.
 *      We reset the increasing subarray length.
 *    - If the elements are equal, both subarrays end, and we compare and store the maximum lengths found so far,
 *      then reset both subarray lengths.
 *
 * 5. At the end of the iteration, we make sure to compare and store the final values of both subarrays
 *    in case the longest subarray ends at the last element.
 *
 * 6. Finally, we return the maximum of the two tracked lengths (`increasingLength` and `decreasingLength`),
 *    which gives the length of the longest strictly increasing or strictly decreasing subarray.
 *
 * 7. This approach runs in O(n) time complexity where n is the length of the array.
 */

class Solution {

    public static void main(String[] args) {
        int[] arr = {3,2,1};
        System.out.println(longestMonotonicSubarray(arr));
    }

    public static int longestMonotonicSubarray(int[] nums) {
        int increasingLength = 0;
        int decreasingLength = 0;

        int currentIncreasingLength = 1;
        int currentDecreasingLength = 1;

        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length) {
                if (nums[i] < nums[i + 1]) {
                    currentIncreasingLength++;
                    decreasingLength = Math.max(decreasingLength, currentDecreasingLength);
                    currentDecreasingLength = 1;
                } else if (nums[i] > nums[i + 1]) {
                    increasingLength = Math.max(increasingLength, currentIncreasingLength);
                    currentIncreasingLength = 1;
                    currentDecreasingLength++;
                } else{
                    increasingLength = Math.max(increasingLength, currentIncreasingLength);
                    decreasingLength = Math.max(decreasingLength, currentDecreasingLength);
                    currentIncreasingLength = 1;
                    currentDecreasingLength = 1;
                }
            }
        }
        increasingLength = Math.max(increasingLength, currentIncreasingLength);
        decreasingLength = Math.max(decreasingLength, currentDecreasingLength);
        return Math.max(increasingLength, decreasingLength);
    }
}
