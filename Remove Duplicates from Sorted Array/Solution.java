class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        
        int addIndex = 1; //index that unique characters will be inserted at

        for(int i = 0; i < nums.length - 1; i++) {
            
            if(nums[i] < nums[i + 1]){ //if true, num[i + 1] is a new unique number
              nums[addIndex] = nums[i + 1];
              addIndex++;
            }
        }
        return addIndex;
    }
}
