class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int totalObservations = rolls.length + n;
        int[] result = new int[n];

        int sumOfGivenObservations = 0;
        int totalSum = totalObservations * mean;
        for (int i = 0; i < rolls.length; i++) {
            sumOfGivenObservations += rolls[i];
        }
        int missingSum = totalSum - sumOfGivenObservations;
        if (missingSum < 0 || missingSum / n > 6) return new int[0];
        int i = 0;
        while (missingSum > 0) {
            result[i] += missingSum / n;
            if (result[i] > 6) return new int[0];
            missingSum -= missingSum / n;
            n--;
            i++;
        }
        return Arrays.toString(result).contains("0") ? new int[0] : result;
    }
}
