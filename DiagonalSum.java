public class DiagonalSum {
    public static int Sum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = sum + matrix[i][i];
            if (i != matrix.length - 1 - i) {
                sum = sum + matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;

    }

    public static void main(String atgs[]) {
        System.out.println("Sum is" + Sum(matrix));
    }

}
