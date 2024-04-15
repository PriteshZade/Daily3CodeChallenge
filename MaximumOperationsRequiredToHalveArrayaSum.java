import java.util.PriorityQueue;
import java.util.Comparator;

class Solution {
    public int halveArray(int[] nums) {

        PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());
        double sum = 0;

        for (int num : nums) {
            double value = num;
            pq.add(value);
            sum += value;
        }

        double halfSum = sum;
        int count = 0;
        double targetSum = sum / 2.0;

        while (halfSum > targetSum) {

            double largest = pq.poll();

            halfSum -= largest / 2.0;

            pq.add(largest / 2.0);

            count++;
        }

        return count;
    }
}
