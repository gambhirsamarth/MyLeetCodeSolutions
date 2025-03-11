import java.util.HashSet;
import java.util.Set;

class Solution {
    // Time: O(n^2), Space: O(1)
    // TLE :(
    public int numberOfSubstrings(String s) {
        int result = 0;
        if (s.contains("a") && s.contains("b") && s.contains("c")) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                set.clear();
                for (int j = i; j < s.length(); j++) {
                    set.add(s.charAt(j));
                    if (set.contains('a') && set.contains('b') && set.contains('c')) {
                        result += (s.length() - j);
                        break;
                    }
                }
            }
        }
        return result;
    }
}