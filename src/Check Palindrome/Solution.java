class Solution {
    public boolean isPalindrome(int x) {
        int rem,num=0,initial;
        initial=x;
        while(x>0)
        {
            rem=x%10;
            num=num*10+rem;
            x=x/10;
        }
        
        if(num==initial)
            return true;
        else
            return false;
    }
}
