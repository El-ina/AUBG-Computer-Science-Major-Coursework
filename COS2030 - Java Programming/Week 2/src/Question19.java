import java.util.Scanner;

public class Question19 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the step and the ending value: ");
        double step = scanner.nextDouble();
        double end = scanner.nextDouble();

        int n = (int) Math.round(end / step);

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += i * step;
        }

        System.out.printf("Sum: %.4f%n", sum);
    }
}
