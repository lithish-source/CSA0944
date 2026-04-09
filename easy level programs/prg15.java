public class CompositeNumbers {
    public static void main(String[] args) {
        int[] arr = {16, 18, 27, 16, 23, 21, 19};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (num <= 1) continue;

            int factors = 0;

            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    factors++;
                }
            }

            if (factors > 2) {
                count++;
            }
        }

        System.out.println("Number of Composite Numbers = " + count);
    }
}