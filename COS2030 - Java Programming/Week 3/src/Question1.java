import java.util.Scanner;

public class Question1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        long number = scanner.nextLong();

        System.out.println("Sum of digits: " + sumDigits(number));
        System.out.println("Digital root: " + digitalRoot(number));
    }

    public static int sumDigits(long n){
        int sum = 0;

        while(n != 0){
            long lastDigit = n % 10;
            sum += (int) lastDigit;

            n /= 10;
        }

        return sum;
    }

    public static int digitalRoot(long n){
        int sumDigits = sumDigits(n);

        while(sumDigits / 10 != 0){
            sumDigits = sumDigits(sumDigits);
        }

        return sumDigits;
    }
}
