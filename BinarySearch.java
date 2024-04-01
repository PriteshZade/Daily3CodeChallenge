public class BinarySearch {
    public static int Searching(int numbers[], int keyword) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == keyword) {
                return mid;
            }
            if (numbers[mid] < keyword) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        int numbers[] = { 1, 4, 6, 8, 9, 10 };
        int keyword = 11;
        System.out.println(Searching(numbers, keyword));

    }
}
