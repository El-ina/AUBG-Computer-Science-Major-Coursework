import java.util.Arrays;
import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First phrase: ");
        String first = scanner.nextLine();
        System.out.print("Second phrase: ");
        String second = scanner.nextLine();

        System.out.println("Letters in the first: " + describe(letterCounts(first)));
        System.out.println("Letters in the second: " + describe(letterCounts(second)));
        System.out.println("Anagrams: " + isAnagram(first, second));
    }

    public static int[] letterCounts(String s) {
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                counts[ch - 'a']++;
            }
        }
        return counts;
    }

    public static boolean isAnagram(String a, String b) {
        return Arrays.equals(letterCounts(a), letterCounts(b));
    }

    public static String describe(int[] counts) {
        String result = "";
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                if (!result.isEmpty()) {
                    result += " ";
                }
                result += (char) ('a' + i) + "" + counts[i];
            }
        }
        return result;
    }
}
