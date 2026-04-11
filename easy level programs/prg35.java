// 35. Skip K Numbers
class SkipNumbers {
    public static void main(String[] args) {
        int M = 50, N = 100, K = 7;

        for (int i = M; i <= N; i += (K + 1)) {
            System.out.print(i + " ");
        }
    }
}