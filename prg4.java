import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Banana", "Carrot", "Radish", "Apple", "Jack"};
        char order = 'A';

        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if ((order == 'A' && names[i].compareTo(names[j]) > 0) ||
                    (order == 'D' && names[i].compareTo(names[j]) < 0)) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}