import java.util.*;

class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < amount.length; i++) {
            if (amount[i] != 0) {
                pq.add(amount[i]);
            }

        }
        int time = 0;
        while (pq.size() != 1 && pq.size() != 0) {
            int x = pq.remove();
            int y = pq.remove();
            time++;
            if (x - 1 != 0) {
                pq.add(x - 1);
            }
            if (y - 1 != 0) {
                pq.add(y - 1);
            }

        }
        if (pq.size() == 1) {
            time = time + pq.remove();
        }
        return time;
    }
}