func interpret(command string) string {
	result := ""
	for index := 0; index < len(command); index++ {
		if command[index] == 'G' {
			result += "G"
		} else if command[index] == '(' {
			if command[index+1] == ')' {
				result += "o"
			} else {
				result += "al"
			}
		}
	}
	return result
}