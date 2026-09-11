import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class Question04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        int dollars = 0, quarters = 0, dimes = 0, nickels = 0, pennies = 0;
        /*
        Conversion Table:
        - 1 dollar = 100 cents
        - 1 quarter = 25 cents
        - 1 dimes = 10 cents
        - 1 nickel = 5 cents
        - 1 penny = 1 cent
         */

        int amountInCents = (int) (amount * 100);

        dollars = amountInCents / 100;
        amountInCents -= dollars * 100;

        quarters = amountInCents / 25;
        amountInCents -= quarters * 25;

        dimes = amountInCents / 10;
        amountInCents -= dimes * 10;

        nickels = amountInCents / 5;
        amountInCents -= nickels * 5;


        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + amountInCents);
    }
}
