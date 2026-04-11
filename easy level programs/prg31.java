// 31. GCD & LCM
class GcdLcm {
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {16, 20};

        int g = arr[0];
        int l = arr[0];

        for (int i = 1; i < arr.length; i++) {
            g = gcd(g, arr[i]);
            l = (l * arr[i]) / gcd(l, arr[i]);
        }

        System.out.println("GCD = " + g);
        System.out.println("LCM = " + l);
    }
}