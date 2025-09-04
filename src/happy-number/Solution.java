import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {

        if (n == 1)
            return true;
        else {

            Set<Integer> seen = new HashSet<>();

            while (n != 1) {
                n = nextSum(n);
                if (n == 1)
                    return true;
                if (seen.contains(n))
                    return false;
                else
                    seen.add(n);
            }
        }

        return false;
    }

    public int nextSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += ((number % 10) * (number % 10));
            number /= 10;
        }
        return sum;
    }
}