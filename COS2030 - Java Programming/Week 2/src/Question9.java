import java.util.Scanner;

public class Question9 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int decimal = scanner.nextInt();
        StringBuilder hex = new StringBuilder(new String());

        int lastDigit = decimal % 16;

        while(lastDigit != 0){
            char addendum = switch (lastDigit){
                case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 -> (char) lastDigit;
                case 10 -> 'A';
                case 11 -> 'B';
                case 12 -> 'C';
                case 13 -> 'D';
                case 14 -> 'E';
                case 15 -> 'F';
                default -> 'n';
            };

            hex.append(addendum);

            decimal /= 16;
            lastDigit = decimal % 16;
        }

        System.out.println(hex.reverse());
    }
}
