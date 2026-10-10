import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String pw = scanner.nextLine();

        int broken = 0;
        if (pw.length() < 10) {
            System.out.println("- needs at least 10 characters (it has " + pw.length() + ")");
            broken++;
        }
        if (!hasUpper(pw)) {
            System.out.println("- needs an upper-case letter");
            broken++;
        }
        if (!hasLower(pw)) {
            System.out.println("- needs a lower-case letter");
            broken++;
        }
        if (!hasDigit(pw)) {
            System.out.println("- needs a digit");
            broken++;
        }
        if (!hasSymbol(pw)) {
            System.out.println("- needs a character that is not a letter, a digit or a space");
            broken++;
        }
        if (hasSpace(pw)) {
            System.out.println("- must not contain spaces");
            broken++;
        }

        if (broken == 0) {
            System.out.println("Accepted");
        } else {
            System.out.println("Rejected: " + broken + " rule(s) broken");
        }

        boolean agree = hasUpper(pw) == pw.matches(".*[A-Z].*")
                && hasLower(pw) == pw.matches(".*[a-z].*")
                && hasDigit(pw) == pw.matches(".*[0-9].*")
                && hasSymbol(pw) == pw.matches(".*[^A-Za-z0-9\\s].*")
                && hasSpace(pw) == pw.matches(".*\\s.*");
        System.out.println("The regular-expression checks agree: " + agree);
    }

    public static boolean hasUpper(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) return true;
        }
        return false;
    }

    public static boolean hasLower(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) return true;
        }
        return false;
    }

    public static boolean hasDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) return true;
        }
        return false;
    }

    public static boolean hasSymbol(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) return true;
        }
        return false;
    }

    public static boolean hasSpace(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) return true;
        }
        return false;
    }
}
