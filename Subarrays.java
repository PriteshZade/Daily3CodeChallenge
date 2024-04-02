public class Subarrays {
    public static void PrintSubarray(int numbers[]) {
        int ts = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                // int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k]);
                    // sum = sum + numbers[k];
                }
                ts++;
                // System.out.print(" sum of this subbarray is " + sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total no of arrays are : " + ts);

    }

    public static void main(String args[]) {
        int numbers[] = { 1, 3, 5, 7, 9 };
        PrintSubarray(numbers);

    }
}
