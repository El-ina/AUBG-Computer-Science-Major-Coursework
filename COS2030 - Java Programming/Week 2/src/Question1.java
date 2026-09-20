import java.util.Scanner;

public class Question1{
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter filing status (0-3): ");
        int filingStatus = scanner.nextInt();

        if(filingStatus < 0 || filingStatus > 3){
            System.out.println("Invalid filing status. Enter a value between 0 and 3.");
            System.exit(1);
        }

        System.out.print("Enter taxable income: ");
        double annualTaxableIncome = scanner.nextDouble();

        double tax;

        if (annualTaxableIncome <= 12_400)
            tax = 0.10 * annualTaxableIncome;
        else if (annualTaxableIncome <= 50_400)
            tax = 1_240 + 0.12 * (annualTaxableIncome - 12_400);
        else if (annualTaxableIncome <= 105_700)
            tax = 5_800 + 0.22 * (annualTaxableIncome - 50_400);
        else if (annualTaxableIncome <= 201_775)
            tax = 17_966 + 0.24 * (annualTaxableIncome - 105_700);
        else if (annualTaxableIncome <= 256_225)
            tax = 41_024 + 0.32 * (annualTaxableIncome - 201_775);
        else if (annualTaxableIncome <= 640_600)
            tax = 58_448 + 0.35 * (annualTaxableIncome - 256_225);
        else
            tax = 192_979.25 + 0.37 * (annualTaxableIncome - 640_600);

        System.out.printf("Tax: %.2f%n", tax);
    }
}