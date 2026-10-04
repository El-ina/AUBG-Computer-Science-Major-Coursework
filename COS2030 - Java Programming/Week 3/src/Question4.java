import java.util.Scanner;

public class Question4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        long steps = 0;

        while(true){
            long revNumber = reverse(number);
            long sum = number + revNumber;

            System.out.println(number + " + " + revNumber + " = " + sum);

            steps++;
            number = sum;

            if(isPalindrome(sum)) break;
        }

        System.out.println("Palindrome after " + steps + " steps");

    }

    public static long reverse(long n){
        StringBuilder s = new StringBuilder();

        while(n != 0){
            long digit = n % 10;
            s.append(digit);

            n /= 10;
        }

        return Long.parseLong(s.toString());
    }

    public static boolean isPalindrome(long n){
        return n == reverse(n);
    }

    public static int reverse(int n){
        StringBuilder s = new StringBuilder();

        while(n != 0){
            int digit = n % 10;
            s.append(digit);

            n /= 10;
        }

        return Integer.parseInt(s.toString());
    }

    public static boolean isPalindrome(int n){
        return n == reverse(n);
    }
}
