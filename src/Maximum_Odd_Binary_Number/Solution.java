class Solution {
    public String maximumOddBinaryNumber(String inputString) {
        // count number of ones
        int noOfOnes = 0;
        for(int i = 0; i < inputString.length(); i++ ){
            if(inputString.charAt(i)=='1')
                noOfOnes++;
        }

        // create a new stringbuilder for result
        StringBuilder result = new StringBuilder();

        // traverse again to create result
        for(int i = 0; i<inputString.length() ; i++ ){
            // if it is last position , add 1 and break because all odd numbers have 1 at end
            if(i == inputString.length()-1){
                result.append("1");
                break;
            }
            // if only one 1 is left, fill zeroes
            if(noOfOnes == 1){
                result.append("0");
            }
            // if multiples 1s are left, fill 1s
            if(noOfOnes > 1){
                result.append("1");
                noOfOnes--;
            }
        }
        return result.toString();
    }
}
