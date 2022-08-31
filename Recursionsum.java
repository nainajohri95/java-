public class Recursionsum {
    public static int sumcount(int n) {
        if (n == 1) { // base case
            return 1;
        }
        int sum1 = sumcount(n - 1);
        int sum2 = n + sum1;
        return sum2;
    }

    public static void main(String[] args) {
        int n=8;
        System.out.println(sumcount(n));
    }
}
