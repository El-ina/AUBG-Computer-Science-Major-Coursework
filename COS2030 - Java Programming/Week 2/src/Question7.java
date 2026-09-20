import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class Question7 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows, columns, border char, fill char: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        String border = scanner.next();
        String fill = scanner.next();

        for(int i = 1; i <= rows; i++){

            if(i == 1 || i == rows) {
                for(int j = 1; j <= cols; j++) System.out.print(border);
                System.out.println();
                continue;
            }

            System.out.print(border);
            for(int j = 1; j <= cols - 2; j++) System.out.print(fill);
            System.out.println(border);
        }
    }
}
