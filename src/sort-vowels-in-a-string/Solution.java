import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (isVolwel(s.charAt(i)))
                vowels.add(s.charAt(i));
        }

        Collections.sort(vowels);

        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!isVolwel(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
                continue;
            } else {
                stringBuilder.append(vowels.get(index++));
            }
        }

        return stringBuilder.toString();
    }

    private boolean isVolwel(char character) {
        return (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U'
                || character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u');
    }
}