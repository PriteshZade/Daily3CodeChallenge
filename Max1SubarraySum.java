public class Max1SubarraySum {
    public static void PrintSubarray(int numbers[]) {
        int MaxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {

                int CurrentSum = 0;
                for (int k = i; k <= j; k++) {
                    // System.out.print(numbers[k]);
                    CurrentSum = CurrentSum + numbers[k];

                }
                System.out.println(CurrentSum);
                if (CurrentSum > MaxSum) {
                    MaxSum = CurrentSum;
                }

                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum sum Subarray : " + MaxSum);

    }

    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        PrintSubarray(numbers);

    }
}
