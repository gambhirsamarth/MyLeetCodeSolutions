class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix[]=new int[n];
        int product[] =  new int[n];

        prefix[0]=1; // since first element can have no prefix
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        
        int suffixproduct=1;
        
        // Building Product Array
        for(int i=n-1;i>=0;i--)
        {
            product[i]=suffixproduct*prefix[i];
            suffixproduct*=nums[i];
        }

        return product;
    }
}
