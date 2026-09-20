import java.util.Scanner;

public class Question4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        /*System.out.print("Enter the secret number: ");
        int secretNumber = scanner.nextInt();*/

        int secretNumber = (int) (Math.random() * 100);
        Boolean flag = false;

        int attempts = 0;

        for(int i = 1; i <= 7; i++){
            attempts = i;
            int guess = scanner.nextInt();

            if(guess < secretNumber) System.out.println("Too low");
            else if(guess > secretNumber) System.out.println("Too high");
            else{
                flag = true;
                System.out.println("Correct");
                break;
            }
        }

        if(!flag) System.out.println("Incorrect. The number was: " + secretNumber);
        System.out.println("Attempts: " + attempts);
    }
}
