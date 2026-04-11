// 30. Voting Eligibility
import java.util.Scanner;

class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18)
            System.out.println("Eligible to vote");
        else
            System.out.println("You are allowed to vote after " + (18 - age) + " years");
    }
}