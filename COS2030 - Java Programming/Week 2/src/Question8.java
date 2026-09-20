import java.util.Scanner;

public class Question8 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        System.out.print(" ".repeat(6) + '|');
        for(int i = 1; i <= n; i++) System.out.printf("%6s", i);
        System.out.println();

        System.out.print("-".repeat(6) + '+' + "-".repeat(n * 6) + '\n');

        for(int i = 1; i <= n; i++){
            System.out.printf("%5s", i);
            System.out.printf("%2s", '|');

            for(int j = 1; j <= n; j++){
                System.out.printf("%6s", i * j);
            }
            System.out.println();
        }
    }
}
