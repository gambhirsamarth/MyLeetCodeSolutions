class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0, ans = 0;

        for(int i=0; i<gain.length; i++){
            sum+=gain[i];
            ans = Math.max(sum,ans);
        }

        if(ans<0) return 0;
        return ans;
    }
}
