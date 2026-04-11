// 28. Reverse Number (input)
import java.util.Scanner;

class ReverseNumberInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int rev = 0;
        while (num != 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num /= 10;
        }

        System.out.println("Reverse Number: " + rev);
    }
}