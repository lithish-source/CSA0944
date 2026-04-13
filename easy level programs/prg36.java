// 36. Composite numbers between a and b
class CompositeRange {
    public static void main(String[] args) {
        int a = 12, b = 19;

        if (a > b) { int t = a; a = b; b = t; }

        for (int i = a; i <= b; i++) {
            if (i <= 1) continue;

            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) count++;
            }

            if (count > 2) System.out.print(i + " ");
        }
    }
}