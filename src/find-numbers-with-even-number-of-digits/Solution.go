func findNumbers(nums []int) int {
	res := 0
	for _,num := range nums {
		if num > 9 && num <= 99 {
			res++
		} else if num > 999 && num <= 9999 {
			res++
		} else if num == 100000 {
			res++
		}
	}
	return res
}