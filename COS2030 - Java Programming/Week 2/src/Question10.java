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

        Question20.getGCD(a, b);

        System.out.println("LCM: " + lcm);
    }
}
