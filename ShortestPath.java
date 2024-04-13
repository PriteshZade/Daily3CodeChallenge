public class ShortestPath {
    public static void main(String args[]) {
        String Direction = "WNEENESENNN";
        Finding(Direction);
    }

    public static void Finding(String Direction) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < Direction.length(); i++) {
            if (Direction.charAt(i) == 'N') {
                y = y + 1;
            }
            if (Direction.charAt(i) == 'S') {
                y = y - 1;
            }
            if (Direction.charAt(i) == 'E') {
                x = x + 1;
            }
            if (Direction.charAt(i) == 'W') {
                x = x - 1;
            }
        }
        while (x > 0) {
            System.out.print("E");
            x--;
        }
        while (x < 0) {
            System.out.print("W");
            x++;
        }
        while (y > 0) {
            System.out.print("N");
            y--;
        }
        while (y < 0) {
            System.out.print("S");
            y++;
        }

    }
}
