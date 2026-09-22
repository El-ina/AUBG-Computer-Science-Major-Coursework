import java.util.Scanner;

public class Question9 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int decimal = scanner.nextInt();
        Question20.decToHex(decimal);
    }
}
