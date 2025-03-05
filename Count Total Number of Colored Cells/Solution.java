/*
n=1 - 1 		- 1
n=2 - 5 		- 1 + 4 		      or (1+ 4*(1))
n=3 - 13 		- 1 + 4 + 8 		  or (1+ 4*(1+2))
n=4 - 25 		- 1 + 4 + 8 + 12	or (1+ 4*(1+2+3))

for n, it will be 4 multiplied by sum of (n-1) digits
formula for sum of n digits is n*(n+1)/2
so, formula for n-1 digits will be (n-1)*n/2

algo:
if n = 1, return 1
if n > 1, return 4 multiplied by sum of (n-1) digits + 1 (plus 1 for the first minute)

Time Complexity : O(1)
Space Complexity : O(1)
*/

class Solution {
    public long coloredCells(int n) {
        if (n == 1) return 1;
        else {
            return 4 * (((long) n * (n - 1)) / 2) + 1;
        }
    }
}
