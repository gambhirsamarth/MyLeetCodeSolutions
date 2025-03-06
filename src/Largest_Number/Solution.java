class Solution {
    public String largestNumber(int[] nums) {
        // Convert the array of integers to an array of strings
        String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = String.valueOf(nums[i]);
        }

        // Sort the array of strings in descending order
        Arrays.sort(numStrs, (a, b) -> (b + a).compareTo(a + b));

        // Combine the sorted strings into a single string
        StringBuilder sb = new StringBuilder();
        for (String numStr : numStrs) {
            sb.append(numStr);
        }


        // Return the final result as a string
        if(sb.charAt(0)=='0') return "0";
        return sb.toString();
    }
}
