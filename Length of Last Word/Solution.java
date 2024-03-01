class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int i = s.length() -1;
        int result = 0;
        for(i = i; i >= 0; i--){
            if(s.charAt(i)==' '){
                break;
            }
            else{
                result++;
            }
        }
        return result;
    }
}
