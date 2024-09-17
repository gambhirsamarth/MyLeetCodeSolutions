class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        List<String> stringOne = List.of(s1.split(" "));
        List<String> stringTwo = List.of(s2.split(" "));
        List<String> result = new ArrayList<>();

        for (int i = 0; i < Math.max(stringOne.size(), stringTwo.size()); i++) {
            if (i < stringOne.size()) {
                frequencyMap.put(stringOne.get(i), frequencyMap.getOrDefault(stringOne.get(i), 0) + 1);
            }
            if(i < stringTwo.size()) {
                frequencyMap.put(stringTwo.get(i), frequencyMap.getOrDefault(stringTwo.get(i), 0) + 1);
            }
        }

        for(String key : frequencyMap.keySet()) {
            if(frequencyMap.get(key) == 1) {
                result.add(key);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
