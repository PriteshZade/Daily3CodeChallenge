public class MaxSubarraySumUsingPrefixArraySum {
    public static void FindingMax(int numbers[])

    {

        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int CurrentSum = 0;
                CurrentSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                System.out.print(CurrentSum);
                System.out.println();
                if (CurrentSum > maxSum) {
                    maxSum = CurrentSum;
                }

            }
        }

        System.out.println("Max sum is" + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        FindingMax(numbers);
    }
}