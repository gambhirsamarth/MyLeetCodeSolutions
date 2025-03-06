import java.util.Collections;
import java.util.PriorityQueue;

class Solution {

    public static void main(String[] args) {
        int [] test = {25,64,9,4,100};
        int k = 4;
        System.out.println(pickGifts(test,k));
    }

    public static long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < gifts.length; i++) {
            queue.add(gifts[i]);
        }

        for(int i=0; i<k; i++){
            int num = queue.poll();
            queue.add((int) Math.sqrt(num));
        }

        long res = 0;
        for(int num : queue){
            res += num;
        }
        return res;
    }
}
