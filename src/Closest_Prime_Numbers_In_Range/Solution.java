class Solution {
    public int[] closestPrimes(int left, int right) {
        List<Integer> primes = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        int[] result = new int[2];
        if (primes.size() < 2) {
            Arrays.fill(result, -1);
            return result;
        }
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < primes.size() - 1; i++) {
            int diff = primes.get(i + 1) - primes.get(i);
            if (diff < minDiff) {
                minDiff = diff;
                result[0] = primes.get(i);
                result[1] = primes.get(i + 1);
            } else if (minDiff == diff && primes.get(i) < result[0]) {
                result[0] = primes.get(i);
                result[1] = primes.get(i + 1);
            }
        }
        return result;
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n != 2 && n % 2 == 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}