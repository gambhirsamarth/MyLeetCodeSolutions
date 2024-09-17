class Solution {
    public static String[] uncommonFromSentences(String s1, String s2) {
        List<String> words = new ArrayList<>();
        words.addAll(List.of(s1.split(" ")));
        words.addAll(List.of(s2.split(" ")));
        List<String> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String word : words) {
            if (map.get(word) == 1) {
                res.add(word);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
