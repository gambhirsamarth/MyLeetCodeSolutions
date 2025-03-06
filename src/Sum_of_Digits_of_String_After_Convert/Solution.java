class Solution {
    public int getLucky(String s, int k) {
        StringBuilder convertedString = new StringBuilder();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            convertedString.append(s.charAt(i) - 96);
        }

        for (int i = 0; i < k; i++) {
            res = 0;
            for (int pointer = 0; pointer < convertedString.length(); pointer++) {
                res += Integer.parseInt(convertedString.charAt(pointer) + "");
            }
            convertedString = new StringBuilder(String.valueOf(res));
        }
        return res;
    }
}
