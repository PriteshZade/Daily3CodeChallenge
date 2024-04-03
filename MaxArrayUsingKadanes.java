public class MaxArrayUsingKadanes {
    public static void FindingMmax(int numbers[]) {
        int MaxSum = Integer.MIN_VALUE;
        int CurrentSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            CurrentSum = CurrentSum + numbers[i];
            if (CurrentSum < 0) {
                CurrentSum = 0;
            }
            MaxSum = Math.max(CurrentSum, MaxSum);
        }
        System.out.println("Maximum sum is" + MaxSum);

    }

    public static void main(String args[]) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        FindingMmax(numbers);
    }
}
