public class LinearSearch {
    public static int Searching(int numbers[], int keyword) {
        for (int i = 0; i < numbers.length; i++) {
            if (keyword == numbers[i]) {
                return i;
            }

        }

        return -1;

    }

    public static void main(String args[]) {
        int numbers[] = { 12, 45, 78, 32, 56, 49 };
        int keyword = 32;
        int Search = Searching(numbers, keyword);
        if (Search == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at position " + (Search + 1));
        }
    }
}
