import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Question10 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two positive integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int lcm = 0;

        for(int i = Math.max(a, b); i <= a * b; i += Math.max(a, b)){
            if(i % Math.min(a, b) == 0){
                lcm = i;
                break;
            }
        }

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

        System.out.println("LCM: " + lcm);
    }
}
