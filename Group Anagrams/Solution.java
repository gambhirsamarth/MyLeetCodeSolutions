import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>(); // create a hash map to store the sorted strings and their corresponding lists of anagrams
        for (String s : strs) { // iterate over each string in the input array
            char charArray[] = s.toCharArray(); // convert the string to a character array
            Arrays.sort(charArray); // sort the characters in the array
            String sorted = new String(charArray); // convert the sorted array back to a string
            if (!map.containsKey(sorted)) { // check if the sorted string is already a key in the map
                map.put(sorted, new LinkedList<String>()); // if not, add it as a new key with an empty linked list as value
            }
            map.get(sorted).add(s); // add the original unsorted string to the list of strings associated with the sorted string key
        }
        return new LinkedList<>(map.values()); // return the values of the hash map as a linked list of lists of strings, where each list contains the anagrams
    }
}
