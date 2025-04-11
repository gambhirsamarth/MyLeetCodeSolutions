class Solution {
    public int countSymmetricIntegers(int low, int high) {
        // 10000 is the max number in range ( given in constraints )
        // 1 is the minimum number in range ( given in constraints )
        int res = 0;
        for (int i = low; i <= high; i++) {
            if (i < 10)
                continue; // skip single digit numbers
            if (i < 100 && i % 11 == 0)
                res++; // 2 digit numbers
            else if (i >= 1000 && i < 10000) {
                int right = (i % 10) + ((i / 10) % 10);
                int left = ((i / 100) % 10) + ((i / 1000) % 10);
                if (left == right)
                    res++;
            }
        }
        return res;
    }
}