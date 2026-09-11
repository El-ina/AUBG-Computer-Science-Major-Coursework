import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = 0;

        for(int i = 1; i <= 3; i++){
            System.out.print("Enter points: ");
            points += scanner.nextInt();
        }

        System.out.println("Final points: " + points);
    }
}
