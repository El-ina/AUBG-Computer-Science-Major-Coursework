import java.util.Scanner;

public class Question3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter K: ");
        int k = scanner.nextInt();
        int found = 0;

        int i = 0;

        int rowCount = 0;

        while(found < k){
            if(rowCount == 10) {
                System.out.println();
                rowCount = 0;
            }

            if(isPrime(i) && isPrime(reverse(i)) && !isPalindrome(i)){
                System.out.print(i + " ");
                found++;
                rowCount++;
            }

            i++;
        }
    }

    public static boolean isPrime(int n){
        boolean isPrime = true;

        if(n <= 1) isPrime = false;

        for(int i = 2; i < n; i++){
            if(n % i == 0) isPrime = false;
            if (!isPrime) break;
        }

        return isPrime;
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


