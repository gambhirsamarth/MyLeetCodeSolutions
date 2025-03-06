import java.util.HashSet;
import java.util.Set;

class Solution {

    public static void main(String[] args) {
        String [] arr = {"a","b","c","ab","ac","bc","abc"};
        System.out.println(countConsistentStrings("abc", arr));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        Set<Character> allowedWordsSet = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            allowedWordsSet.add(allowed.charAt(i));
        }

        for (int i = 0; i < words.length; i++) {
            boolean isValid = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (!allowedWordsSet.contains(words[i].charAt(j))) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) count++;
        }
        return count;
    }
}
