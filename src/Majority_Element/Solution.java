class Solution {
    public int majorityElement(int[] nums) {
        // using Moore's voting algorithm

        int element =0, count =0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(count==0){
                count=1;
                element = nums[i];
            }
            else if(element == nums[i]) count++;
            else count--;
        }

        // checking if element is present more than n/2 times
        int freq = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == element) freq++;
        }

        if(freq > (n/2)) return element;
        return -1;
    }
}
