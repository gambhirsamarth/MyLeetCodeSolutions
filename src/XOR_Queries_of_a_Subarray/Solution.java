class Solution {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 8};
        int[][] queries = {{0, 1}, {1, 2}, {0, 3}, {3, 3}};
        int[] res = xorQueries(arr, queries);
        for (int re : res) {
            System.out.println(re);
        }
    }

    public static int[] xorQueries(int[] arr, int[][] queries) {
        int[] res = new int[queries.length];

        // Step 1: Convert arr into an in-place prefix XOR array
        for (int i = 1; i < arr.length; ++i) {
            arr[i] ^= arr[i - 1];
        }

        // Step 2: Resolve each query using the prefix XOR array
        int point = 0;
        for (int[] q : queries) {
            res[point++] = q[0] > 0 ? arr[q[0] - 1] ^ arr[q[1]] : arr[q[1]];
        }
        return res;
    }
}
