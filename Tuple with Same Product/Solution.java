 * Approach:
 *
 * 1. **Find Product of Each Pair**:
 *    - For each unique pair of numbers in the `nums` array, we compute the product of the two numbers.
 *    - We store how many times each product occurs using a map (`productToFrequencyMap`).
 *
 * 2. **Count Tuples**:
 *    - For a product that occurs `f` times, it means there are `f` pairs of numbers that have this product.
 *    - To form valid 4-tuples, we need to select 2 distinct pairs from these `f` pairs. The number of ways to do this is \( C(f, 2) = \frac{f \times (f - 1)}{2} \).
 *    - Each pair combination can form **8 distinct 4-tuples**.
 *    - So, for each product, the total number of valid 4-tuples is `8 * C(f, 2)`.
 *
 * 3. **Final Calculation**:
 *    - Add up the total number of valid 4-tuples for each product and return the result.
 */

import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 6, 12, 1};
        System.out.println(tupleSameProduct(nums));
    }

    public static int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productToFrequencyMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                productToFrequencyMap.put(product, productToFrequencyMap.getOrDefault(product, 0) + 1);
            }
        }

        int result = 0;
        for (int productFrequency : productToFrequencyMap.values()) {
            int pairsWithEqualProduct = (productFrequency * (productFrequency - 1)) / 2;
            result += 8 * pairsWithEqualProduct;
        }

        return result;
    }
}
