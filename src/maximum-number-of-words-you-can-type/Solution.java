class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        char[] brokenLettersArray = brokenLetters.toCharArray();
        String[] words = text.split(" ");
        int result = words.length;

        for (String word : words) {
            for (char character : brokenLettersArray) {
                if (word.contains(String.valueOf(character))) {
                    result--;
                    break;
                }
            }
        }
        return result;
    }
}