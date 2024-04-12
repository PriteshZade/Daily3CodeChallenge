import java.util.PriorityQueue;

public class ConnectNRopes {
    public static void main(String args[]) {
        int arr[] = { 2, 3, 3, 4, 6 };
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int cost = 0;
        while (pq.size() != 1) {
            int n = pq.remove() + pq.remove();
            cost = cost + n;
            pq.add(n);
        }
        System.out.println(cost);
    }
}
