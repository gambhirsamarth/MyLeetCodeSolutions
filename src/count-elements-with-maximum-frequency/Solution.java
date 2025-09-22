class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxFrequency = 0;
        int[] frequencyArray = new int[101];

        for (int number : nums) {
            frequencyArray[number]++;
            maxFrequency = Math.max(maxFrequency, frequencyArray[number]);
        }

        int countOfElementsWithMaximumFrequency = 0;

        for (int element : frequencyArray) {
            if (element == maxFrequency) {
                countOfElementsWithMaximumFrequency++;
            }
        }

        return countOfElementsWithMaximumFrequency * maxFrequency;

    }
}