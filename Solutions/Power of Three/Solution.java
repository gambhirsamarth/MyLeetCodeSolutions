class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n==0) return false;
        if(n%3!=0) return false;
        return isPowerOfFour(n/3);
    }
}
