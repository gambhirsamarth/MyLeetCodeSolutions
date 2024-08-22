class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder resultBinary = new StringBuilder();
        for (int i = 0; i < binary.length(); i++) {
            resultBinary.append(binary.charAt(i) == '1' ? "0" : "1");
        }
        return Integer.parseInt(resultBinary.toString(), 2);
    }
}
