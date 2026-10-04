import java.util.Scanner;

public class Question10 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the target comission (EUR): ");
        double targetCommission = scanner.nextDouble();
        double currentComission = 0;
        double currentSales = 0;

        currentComission = commission(currentSales);

        while(currentComission < targetCommission){
            currentSales++;
            currentComission = commission(currentSales);
        }

        System.out.println("Smallest sales figure: " + currentSales + " EUR, earning " + currentComission + " EUR");

    }

    public static double commission(double sales){
        if (sales <= 5000) {
            return sales * 0.08;
        } else if (sales <= 10000) {
            return 5000 * 0.08 + (sales - 5000) * 0.10;
        } else {
            return 5000 * 0.08 + 5000 * 0.10 + (sales - 10000) * 0.12;
        }
    }
}
