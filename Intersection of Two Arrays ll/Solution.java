class Solution {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            int freq = map.getOrDefault(nums2[i], 0);
            if (freq > 0) {
                result.add(nums2[i]);
            }
            map.put(nums2[i], freq - 1);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
