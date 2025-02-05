class Solution {

    public static void main(String[] args) {
        System.out.println(areAlmostEqual("bank", "kanb"));
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        if (s2.equals(s1)) {
            return true;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        int count = 0;
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count > 2) {
                    return false;
                } else if (count == 1) {
                    firstIndex = i;
                } else {
                    secondIndex = i;
                }
            }
        }
        return (count == 2 && s1.charAt(firstIndex) == s2.charAt(secondIndex) && s1.charAt(secondIndex) == s2.charAt(firstIndex));
    }
}
