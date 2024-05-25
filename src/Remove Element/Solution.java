class Solution {
    public int removeElement(int[] nums, int val) {
        
        // taking a variable to count how many elements are not equal to given value
        int k = 0; 
        
        // simple for loop for traversal in the array
        for (int i = 0; i< nums.length ;i++){
            
            //if element of the array is not equal to the val put value in the array and k increase
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        // return the final remaining value in the array
        return k;
    }
}
