import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        System.out.print("Enter the shift: ");
        int k = scanner.nextInt();

        String encrypted = encrypt(text, k);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypt(encrypted, k));
    }

    public static char shift(char ch, int k) {
        if (ch >= 'a' && ch <= 'z') {
            return (char) ('a' + Math.floorMod(ch - 'a' + k, 26));
        }
        if (ch >= 'A' && ch <= 'Z') {
            return (char) ('A' + Math.floorMod(ch - 'A' + k, 26));
        }
        return ch;
    }

    public static String encrypt(String text, int k) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            result.append(shift(text.charAt(i), k));
        }
        return result.toString();
    }

    public static String decrypt(String text, int k) {
        return encrypt(text, -k);
    }
}
