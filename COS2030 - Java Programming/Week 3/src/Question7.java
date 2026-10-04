import java.util.Scanner;

public class Question7 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Loan amount (EUR): ");
        double principal = scanner.nextDouble();

        System.out.print("Annual interest rate (%): ");
        double annualRate = scanner.nextDouble();

        if(annualRate == 0){
            while (annualRate <= 0){
                System.out.println("Invalid annual interest rate! Enter a positive number!");
                System.out.print("Annual interest rate (%): ");
                annualRate = scanner.nextDouble();
            }
        }

        System.out.print("Years: ");
        int years = scanner.nextInt();

        System.out.print("Months to show: ");
        int months = scanner.nextInt();

        printSchedule(principal, annualRate, years, months);
    }

    public static double monthlyPayment(double principal, double annualRate, int years){
        double i = annualRate / 1200;
        double denominator = 1 - Math.pow((1 + i), -12 * years);

        double result = (principal * i) / denominator;

        return result;
    }

    public static void printSchedule(double principal, double annualRate, int years, int months){
        double balance = principal;
        double monthlyRate = annualRate / 1200;

        double monthlyPayment = monthlyPayment(principal, annualRate, years);
        System.out.printf("Monthly payment: %.2f%n", monthlyPayment);
        System.out.println("Month   Interest    Principal   Balance");
        for(int i = 1; i <= months; i++){
            double interest = balance * monthlyRate;
            double ppal = monthlyPayment - interest;

            balance -= ppal;

            System.out.printf("%5d%11.2f%13.2f%10.2f%n", i, interest, ppal, balance);
        }

        double total = monthlyPayment * 12 * years;
        System.out.print("Total repaid over " + years + " years: ");
        System.out.printf("%.2f%n", total);
    }
}
