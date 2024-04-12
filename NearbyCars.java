import java.util.PriorityQueue;

public class NearbyCars {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int sqDist;
        int idx;

        public Point(int x, int y, int sqDist, int idx) {
            this.x = x;
            this.y = y;
            this.sqDist = sqDist;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2) {
            return this.sqDist - p2.sqDist;
        }
    }

    public static void main(String args[]) {
        int arr[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            int d = arr[i][0] * arr[i][0] + arr[i][1] * arr[i][1];

            pq.add(new Point(arr[i][0], arr[i][1], d, i));

        }
        for (int i = 0; i < 2; i++) {
            System.out.println("C" + pq.remove().idx);
        }
    }
}