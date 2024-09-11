class Solution {

    public static void main(String[] args) {
        System.out.println(minBitFlips(3,4));
    }

    public static int minBitFlips(int start, int goal) {
        String xorBinaryString = Integer.toBinaryString(start ^ goal);
        int noOfFlips = 0;
        for(int i=0; i<xorBinaryString.length(); i++) {
            if(xorBinaryString.charAt(i) == '1') {
                noOfFlips++;
            }
        }
        return noOfFlips;
    }
}
