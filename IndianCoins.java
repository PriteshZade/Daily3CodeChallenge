public class IndianCoins {
    public static void main(String args[]) {
        int denominations[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int value = 590;
        int remaining = value;
        int count = 0;
        for (int i = denominations.length - 1; i >= 0; i--) {
            if (remaining == 0) {
                break;

            }
            while (remaining >= denominations[i]) {
                remaining = remaining - denominations[i];
                System.out.println(denominations[i]);
                count++;
            }
        }
        System.out.println(count);

    }
}
