public class FindExponential {
    public static void main(String args[]) {
        System.out.println(Exponential(5, 3));
    }

    public static int Exponential(int n, int exp) {
        int ans = 1;
        while (exp > 0) {
            if ((exp & 1) != 0) {
                ans = ans * n;
            }
            n = n * n;
            exp = exp >> 1;

        }
        return ans;
    }
}
