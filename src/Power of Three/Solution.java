// // Recurssive Approach
// class Solution {
//     public boolean isPowerOfFour(int n) {
//         if(n==1) return true;
//         if(n==0) return false;
//         if(n%3!=0) return false;
//         return isPowerOfFour(n/3);
//     }
// }

// Optimal Solution
class Solution {
    public boolean isPowerOfThree(int n) {
        while(n>=0){
            if(n==1) return true;
            if(n==0) return false;
            if(n%3!=0) return false;
            n=n/3;
        }
        return false;
    }
}
