class Solution {
    public String clearDigits(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                stack.push(String.valueOf(s.charAt(i)));
            } else {
                stack.pop();
            }
        }
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }
}
