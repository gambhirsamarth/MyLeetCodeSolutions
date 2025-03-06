class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        ArrayList<Integer> ans = new ArrayList<>();

        int [] a = new int[101];
        int [] b = new int[101];
        int [] c = new int[101];

        for(int i=0; i<nums1.length; i++) a[nums1[i]]=1;
        for(int i=0; i<nums2.length; i++) b[nums2[i]]=1;
        for(int i=0; i<nums3.length; i++) c[nums3[i]]=1;

        for(int i=0; i<101; i++){
           if(a[i]+b[i]+c[i]>=2) ans.add(i);
        }

        return ans;
    }
}
