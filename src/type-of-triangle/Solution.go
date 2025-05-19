package main

func triangleType(nums []int) string {
	if !isValid(nums) {
		return "none"
	}
	if nums[0] == nums[1] && nums[1] == nums[2] {
		return "equilateral"
	} else if nums[0] != nums[1] && nums[1] != nums[2] && nums[0] != nums[2] {
		return "scalene"
	} else {
		return "isosceles"
	}
}

func isValid(nums []int) bool {
	if nums[0]+nums[1] > nums[2] &&
		nums[0]+nums[2] > nums[1] &&
		nums[1]+nums[2] > nums[0] {
		return true
	} else {
		return false
	}
}
