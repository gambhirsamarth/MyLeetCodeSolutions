class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int ans =Integer.MIN_VALUE;

        // person-> Row, account -> Column
        for(int person=0; person<accounts.length; person++){

            // for each column, take a new sum
            int sum=0;

            for(int account=0; account<accounts[person].length; account++){
                sum+= accounts[person][account];
            }

            // now we have sum of accounts of person 
            // check with overall ans

            if(sum>ans){
                ans=sum;
            }
        }

        return ans;

    }
}
