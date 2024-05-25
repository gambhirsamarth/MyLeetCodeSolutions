class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        int count = 0;
        int sum = 0;
        int rem = 0;

        // create a hashmap that will store the frequency of remainder
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);//frequency of zero remainder is one

        for(int i = 0; i < nums.length; i++){

            sum += nums[i];
            rem = sum % k;

            //If remainder is negative add k to remainder

            if(rem < 0){
                rem += k;
            }

            //If map contains the remainder then get its frequency and add it to count
            
            if(map.containsKey(rem)){
                count += map.get(rem);
                map.put(rem,map.get(rem)+1);
            }
            else{
                map.put(rem,1);
            }
        }
        return count;
    }
}
