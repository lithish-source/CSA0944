public class RemoveVowels {
    public static void main(String[] args) {
        String str = "we can play the game";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                  ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                result = result + ch;
            }
        }

        System.out.println("The string without vowels is: " + result);
    }
}