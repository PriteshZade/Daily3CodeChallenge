public class FindingIfNumberRepeatsOrNot {
    public static int Findings(int numbers[]) {
        int n;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if ((numbers[i] == numbers[j]) && (i != j)) {
                    n = 1;
                    return 1;
                } else {
                    n = 0;
                }
            }

        }
        return 0;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        int c = Findings(numbers);
        if (c == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
