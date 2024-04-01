import java.util.*;

public class Largestnumbers {
    public static int getLargest(int numbers[]) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > large) {
                large = numbers[i];
            }
        }
        return large;

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 3, 6, 4, 1, 5 };
        int Largest = getLargest(numbers);
        System.out.println(Largest);

    }
}
