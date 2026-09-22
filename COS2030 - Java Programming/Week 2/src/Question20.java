import java.util.Scanner;

public class Question20 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        printOptions();
        System.out.print("Choice: ");
        byte choice = scanner.nextByte();

        do{
            if(choice == 0){
                System.out.println("Bye");
                break;
            }

            if(choice == 1){
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                getGCD(a, b);
            }

            else if(choice == 2){
                int decimal = scanner.nextInt();
                decToHex(decimal);
            }

            else if(choice == 3){
                int number = scanner.nextInt();
                isPrime(number);
            }

            else if (choice == 4) {
                int n = scanner.nextInt();

                printMultiplicationTable(n);
            }

            System.out.println();
            printOptions();
            System.out.print("Choice: ");
            choice = scanner.nextByte();

        } while (true);
    }

    static void printMultiplicationTable(int n) {
        System.out.print(" ".repeat(6) + '|');
        for(int i = 1; i <= n; i++) System.out.printf("%6s", i);
        System.out.println();

        System.out.print("-".repeat(6) + '+' + "-".repeat(n * 6) + '\n');

        for(int i = 1; i <= n; i++){
            System.out.printf("%5s", i);
            System.out.printf("%2s", '|');

            for(int j = 1; j <= n; j++){
                System.out.printf("%6s", i * j);
            }
            System.out.println();
        }
    }

    static void decToHex(int decimal) {
        StringBuilder hex = new StringBuilder(new String());

        int lastDigit = decimal % 16;

        while(lastDigit != 0){
            char addendum = switch (lastDigit){
                case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 -> (char) lastDigit;
                case 10 -> 'A';
                case 11 -> 'B';
                case 12 -> 'C';
                case 13 -> 'D';
                case 14 -> 'E';
                case 15 -> 'F';
                default -> 'n';
            };

            hex.append(addendum);

            decimal /= 16;
            lastDigit = decimal % 16;
        }

        System.out.println(hex.reverse());
    }

    static void getGCD(int a, int b) {
        int remainder = Math.max(a, b) % Math.min(a, b);
        int gcd = 0;

        if(remainder == 0){
            System.out.println("GCD: " + Math.min(a, b));
        }
        else{
            while (remainder != 0){
                gcd = remainder;
                remainder = Math.max(a, b) % Math.min(a, b);

                a = Math.min(a, b);
                b = remainder;
            }

            System.out.println("GCD: " + gcd);
        }
    }

    static void isPrime(int currNumber){
        if(currNumber <= 1){
            System.out.println("Not prime");
            return;
        }

        int divisorsCounter = 0;
        for(int i = 1; i <= currNumber; i++){
            if(currNumber % i == 0) divisorsCounter++;
        }

        if(divisorsCounter == 2) {
            System.out.println("Prime");
        }
        else System.out.println("Not prime");
    }

    static void printOptions(){
        System.out.println("   1  GCD of two numbers");
        System.out.println("   2  Decimal to hexadecimal");
        System.out.println("   3  Is a number prime");
        System.out.println("   4  Multiplication table");
        System.out.println("   0  Exit");
    }
}
