import java.util.Scanner;

public class Question6 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a/b + c/d as four integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.print(a + "/" + b + " + " + c + "/" + d + " = ");

        int lcm = lcm(b, d);

        int numberToMultiplyFirst = lcm / b;
        int numberToMultiplySecond = lcm / d;

        if(numberToMultiplyFirst != 1 || numberToMultiplySecond != 1){
            System.out.print(a * numberToMultiplyFirst + "/" + lcm + " + " + c * numberToMultiplySecond + "/" + lcm + " = ");
        }

        int numerator = a * numberToMultiplyFirst + c * numberToMultiplySecond;

        System.out.print(numerator + "/" + lcm);

        // To reduce, divide both numbers by their greatest common divisor (GCD).
        // When the GCD is 1, the fraction can't be reduced any further.
        int gcd = gcd(numerator, lcm);

        while(gcd != 1){
            numerator /= gcd;
            lcm /= gcd;

            System.out.print(" = " + numerator + "/" + lcm);

            gcd = gcd(numerator, lcm);
        }

        System.out.println();

    }

    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }
}
