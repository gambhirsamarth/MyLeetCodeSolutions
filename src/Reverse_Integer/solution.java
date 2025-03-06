class Solution 
{
    public int reverse(int x) 
    {
        int ans=0,rem,digit;
        while(x!=0)
        {
            digit=x%10;
            if(ans<-(Math.pow(2,31)/10)||ans>(Math.pow(2,31)-1)/10)
                return 0;
            
            ans=ans*10+digit;
            x=x/10;
        }
        return ans;
    }
}
