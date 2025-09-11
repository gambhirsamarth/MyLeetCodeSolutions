import java.util.PriorityQueue;

class Solution {
    public String sortVowels(String s) {
        PriorityQueue<Character> priorityQueue = new PriorityQueue<>();
        char[] characterArray = s.toCharArray();
        for (char character : characterArray) {
            if (isVolwel(character))
                priorityQueue.add(character);
        }

        for (int i = 0; i < characterArray.length; i++) {
            if (!isVolwel(characterArray[i])) {
                continue;
            } else {
                characterArray[i] = priorityQueue.poll();
            }
        }

        return new String(characterArray);
    }

    private boolean isVolwel(char character) {
        return (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U' ||
                character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u');
    }
}