public class RectanglePattern {
    public static void main(String[] args) {
        char ch = '#';
        int rows = 4, cols = 6;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}