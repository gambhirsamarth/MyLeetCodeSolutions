class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int [] ans = new int[n];
        Arrays.fill(ans  , Integer.MAX_VALUE);

        int lastSeenC = -1;

        for(int i=0; i<n; i++){
            if(s.charAt(i)==c) lastSeenC = i;
            if(lastSeenC==-1) continue;
            ans[i] = Math.min(ans[i], Math.abs(lastSeenC - i));
        }

        lastSeenC = -1;
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i)==c) lastSeenC = i;
            if(lastSeenC==-1) continue;
            ans[i] = Math.min(ans[i], Math.abs(lastSeenC - i));
        }

        return ans;
    }
}
