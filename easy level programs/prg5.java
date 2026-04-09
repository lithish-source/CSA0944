public class SpecialCharacters {
    public static void main(String[] args) {
        String str = "Hello@123#World!";
        int count = 0;

        System.out.print("Special Characters: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!(ch >= 'a' && ch <= 'z') &&
                !(ch >= 'A' && ch <= 'Z') &&
                !(ch >= '0' && ch <= '9') &&
                ch != ' ') {
                System.out.print(ch + " ");
                count++;
            }
        }

        System.out.println("\nCount: " + count);
    }
}