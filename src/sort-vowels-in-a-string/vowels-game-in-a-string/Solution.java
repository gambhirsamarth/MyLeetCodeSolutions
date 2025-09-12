class Solution {
    public boolean doesAliceWin(String s) {
        /*
         * Number of vowels in string can either be odd / even
         * 
         * if odd - alice removes all of them and bob can't make a move - alice wins
         * 
         * if even - alice removes the n-1 vowels(n is total number of vowels) the
         * remaining string has 1 vowel,
         * bob can only remove a consonant as 1 vowel is not even.
         * again ALice's turn - she removes the last remaining vowel and wins.
         * 
         * Bob can only win if there are no vowels in string
         */

        return s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") | s.contains("u");
    }
}