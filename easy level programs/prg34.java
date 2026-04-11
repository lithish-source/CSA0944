// 34. Even Index Fibonacci Sum
class FibEvenSum {
    public static void main(String[] args) {
        int n = 4;
        int a = 0, b = 1, sum = 0;

        for (int i = 0; i <= 2 * n; i++) {
            if (i % 2 == 0) sum += a;

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println(sum);
    }
}