import java.util.Scanner;

public class Question13 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter scores, -1 to finish: ");
        int input = scanner.nextInt();

        int perfectScoresCounter = 0;
        int invalidScoresCounter = 0;

        int validScoresCounter = 0;
        int validScoresSum = 0;

        boolean threePerfectScores = false;

        while (input != -1){
            if(!threePerfectScores){
                if(input < 0 || input > 100) invalidScoresCounter++;
                else{
                    if(input == 100) perfectScoresCounter++;
                    if(perfectScoresCounter == 3) threePerfectScores = true;

                    validScoresCounter++;
                    validScoresSum += input;
                }
            }

            input = scanner.nextInt();
        }

        System.out.println("Valid: " + validScoresCounter);
        System.out.println("Invalid: " + invalidScoresCounter);

        double average = validScoresSum / (double) validScoresCounter;
        System.out.printf("Average: %.2f%n", average);

        System.out.print("Stopped: ");
        if(threePerfectScores) System.out.print("3 perfect scores");
        else System.out.print("-1 was entered");
    }
}
