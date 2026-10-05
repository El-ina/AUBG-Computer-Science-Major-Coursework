import java.util.Scanner;

public class Question17 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter prices in leva, 0 to finish: ");
        double price = scanner.nextDouble();

        double sumInLeva = 0;
        double sumInEuro = 0;

        while(price != 0){
            System.out.printf("%.2f BGN = %.2f EUR%n", price, toEuro(price));

            sumInLeva += price;
            sumInEuro += roundToCent(toEuro(price));

            price = scanner.nextDouble();
        }

        System.out.printf("Converted one by one, then added:%6.2f EUR%n", sumInEuro);
        System.out.printf("Added in leva, then converted:%9.2f EUR%n", toEuro(sumInLeva));
    }

    public static double roundToCent(double amount){
        double rounded = Double.parseDouble(String.format("%.2f", amount));

        return rounded;
    }

    public static double toEuro(double leva){
        return leva / 1.95583;
    }
}
