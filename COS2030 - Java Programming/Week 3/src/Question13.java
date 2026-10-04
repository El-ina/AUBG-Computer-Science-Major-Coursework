import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hex = scanner.nextLine();

        int value = hexToDecimal(hex);
        if (value == -1) {
            System.out.println(hex + " is not a hexadecimal number");
        } else {
            System.out.println("The decimal value of " + hex + " is " + value);
        }

        int failures = 0;
        for (int n = 0; n <= 65535; n++) {
            if (hexToDecimal(decimalToHex(n)) != n) {
                failures++;
            }
        }
        System.out.println("Round trips from 0 to 65535: " + failures + " failures");
    }

    public static int hexToDecimal(String hex) {
        if (hex.isEmpty()) {
            return -1;
        }
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            int digit = hexCharToDecimal(hex.charAt(i));
            if (digit == -1) {
                return -1;
            }
            decimalValue = decimalValue * 16 + digit;
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= '0' && ch <= '9') {
            return ch - '0';
        } else if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else if (ch >= 'a' && ch <= 'f') {
            return 10 + ch - 'a';
        } else {
            return -1;
        }
    }

    public static String decimalToHex(int n) {
        if (n == 0) {
            return "0";
        }
        String hex = "";
        while (n > 0) {
            int digit = n % 16;
            char hexChar = (digit <= 9) ? (char) ('0' + digit) : (char) ('A' + digit - 10);
            hex = hexChar + hex;
            n = n / 16;
        }
        return hex;
    }
}