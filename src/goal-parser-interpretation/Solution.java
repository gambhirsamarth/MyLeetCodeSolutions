class Solution {
    public String interpret(String command) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                result.append('G');
            } else if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    result.append('o');
                    i++; // Skip the next character ')'
                } else {
                    result.append("al");
                    i += 3; // Skip the next three characters 'al)'
                }
            }
        }
        return result.toString();
    }
}