import java.util.Scanner;

public class Question16 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an amount (EUR): ");
        double amount = scanner.nextDouble();

        long totalCents = Math.round(amount * 100);
        int euros = (int) (totalCents / 100);
        int cents = (int) (totalCents % 100);

        String text = inWords(euros) + " euros";
        if (cents != 0) {
            text += " and " + inWords(cents) + " cents";
        }
        System.out.println(text);
    }

    public static String inWords(int n){
        if (n < 1000) {
            return below1000(n);
        }
        String result = below1000(n / 1000) + " thousand";
        if (n % 1000 != 0) {
            result += " " + below1000(n % 1000);
        }
        return result;
    }

    public static String below20(int n) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen"};
        return words[n];
    }

    public static String tens(int d) {
        String[] words = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        return words[d];
    }

    public static String below100(int n) {
        if (n < 20) {
            return below20(n);
        }
        String result = tens(n / 10);
        if (n % 10 != 0) {
            result += "-" + below20(n % 10);
        }
        return result;
    }

    public static String below1000(int n) {
        if (n < 100) {
            return below100(n);
        }
        String result = below20(n / 100) + " hundred";
        if (n % 100 != 0) {
            result += " " + below100(n % 100);
        }
        return result;
    }
}
