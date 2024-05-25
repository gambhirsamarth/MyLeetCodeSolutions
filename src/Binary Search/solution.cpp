class Solution {
public:
    int search(vector<int>& nums, int target) {
        int start=0;
		int end=nums.size();
		int mid=0;
		if(nums[0]==target)
			return 0;
		while(start!=end)
		{
			mid=(start+end)/2;
			if(nums[mid]==target)
				return mid;
			if(target>nums[mid])
				start=mid+1;
			else
				end=mid;
		}
		return -1;
    }
};
