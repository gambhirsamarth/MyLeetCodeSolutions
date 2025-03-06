class Solution {
    public long coloredCells(int n) {
        long ans =0;
        
        for(int i=0; i<n; i++){
            if(i==0){
                ans =1;
            }
            else{
                ans = ans + 4*i;
            }
        }
        
        return ans;
    }
}
