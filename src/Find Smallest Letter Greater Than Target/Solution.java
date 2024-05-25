class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(target<letters[mid]){
                end=mid-1;
            }

            else{
                start=mid+1;
            }
        }

        // to return the 0th index if start reaches the last index of array 
        // and no larger character is found
        return letters[ start % letters.length ]; 
        // (if start==n) return letters[0] can also be used instead
    }
}
