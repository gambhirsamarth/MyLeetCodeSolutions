package main

/*
1 - 2
2 - 2
3 - 2
4 - 2
5 - 1
6 - 1
7 - 1
8 - 1
9 - 1
*/

func main() {
	countLargestGroup(13)
}

//
//func countLargestGroup(n int) int {
//	digitSumToFrequencyMap := make(map[int]int)
//	maxFreq := 0
//	result := 0
//	for i := 1; i <= n; i++ {
//		digitSum := 0
//		for j := i; j > 0; j /= 10 {
//			digitSum += j % 10
//		}
//		digitSumToFrequencyMap[digitSum]++
//	}
//	for _, value := range digitSumToFrequencyMap {
//		if value > maxFreq {
//			maxFreq = value
//		}
//	}
//	for _, value := range digitSumToFrequencyMap {
//		if value == maxFreq {
//			result++
//		}
//	}
//	return result
//}

func countLargestGroup(n int) int {
	digitSumToFrequencyMap := make(map[int]int)
	maxFreq := 0
	result := 0
	for i := 1; i <= n; i++ {
		digitSum := 0
		for j := i; j > 0; j /= 10 {
			digitSum += j % 10
		}
		digitSumToFrequencyMap[digitSum]++
		if maxFreq < digitSumToFrequencyMap[digitSum] {
			maxFreq = digitSumToFrequencyMap[digitSum]
		}
	}
	for _, value := range digitSumToFrequencyMap {
		if value == maxFreq {
			result++
		}
	}
	return result
}
