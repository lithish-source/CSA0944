public class FindCharacter {
    public static void main(String[] args) {
        String str = "I am a programmer";
        char target = 'p';
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                System.out.println(target + " is found in string at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Character not found");
        }
    }
}