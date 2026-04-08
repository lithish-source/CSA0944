import java.util.Arrays;

public class MeanMedianMode {
    public static void main(String[] args) {
        int[] arr = {16, 18, 27, 16, 23, 21, 19};

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double mean = sum / arr.length;

        Arrays.sort(arr);
        double median = arr[arr.length / 2];

        int mode = arr[0], maxCount = 1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }

        System.out.println("Mean = " + (int)mean);
        System.out.println("Median = " + (int)median);
        System.out.println("Mode = " + mode);
    }
}