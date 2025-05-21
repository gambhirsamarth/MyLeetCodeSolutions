package main

func setZeroes(matrix [][]int) {
	rowsArray := make([]int, len(matrix))
	colsArray := make([]int, len(matrix[0]))

	for rowIndex, row := range matrix {
		for colIndex, col := range row {
			if col == 0 {
				rowsArray[rowIndex] = 1
				colsArray[colIndex] = 1
			}
		}
	}
	for rowIndex, row := range matrix {
		for colIndex := range row {
			if rowsArray[rowIndex] == 1 || colsArray[colIndex] == 1 {
				matrix[rowIndex][colIndex] = 0
			}
		}
	}
}
