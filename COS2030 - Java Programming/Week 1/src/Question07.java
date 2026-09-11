import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double annualInterestRate, loanAmount;
        byte numberOfYears;

        System.out.print("Enter annual interest rate: ");
        annualInterestRate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        numberOfYears = scanner.nextByte();

        System.out.print("Enter loan amount: ");
        loanAmount = scanner.nextDouble();

        double monthlyPayment, totalPayment;

        double interestTerm = Math.pow(1 + annualInterestRate / 1200, numberOfYears * 12);
        monthlyPayment = loanAmount * ((annualInterestRate / 1200) * interestTerm) / (interestTerm - 1);

        totalPayment = numberOfYears * 12 * monthlyPayment;

        System.out.printf("Monthly payment is: %.2f\n", monthlyPayment);
        System.out.printf("Total payment is: %.2f", totalPayment);
    }
}
