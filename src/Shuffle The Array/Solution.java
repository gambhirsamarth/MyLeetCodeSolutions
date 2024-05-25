class Solution {
    public int[] shuffle(int[] nums, int n) {
        int s1=0;
        int s2=n;
        int [] ans = new int[2*n];

        int i=0;
        while(i<2*n){
            ans[i] = nums[s1];
            s1++;
            ans[i+1] = nums[s2];
            s2++;
            i+=2;
        }

        return ans;
    }
}
