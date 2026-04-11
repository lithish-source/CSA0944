// 29. Decimal → Binary → Reverse → Decimal
import java.util.Scanner;

class BinaryReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int bin = 0, place = 1;

        while (n > 0) {
            int r = n % 2;
            bin = bin * 10 + r;
            n /= 2;
        }

        int rev = 0;
        place = 1;

        while (bin > 0) {
            int d = bin % 10;
            rev += d * place;
            place *= 2;
            bin /= 10;
        }

        System.out.println(rev);
    }
}