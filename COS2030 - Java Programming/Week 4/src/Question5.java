import java.lang.classfile.attribute.SourceDebugExtensionAttribute;
import java.util.Scanner;

public class Question5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of scores: ");
        int scoresLen = scanner.nextInt();
        int[] scores = new int[scoresLen];

        System.out.print("Enter " + scoresLen + " scores: ");
        for(int i = 0; i < scoresLen; i++){
            scores[i] = scanner.nextInt();
        }

        int[] distribution = distribution(scores);

        printHistogram(distribution);

    }

    public static int[] distribution(int[] scores){
        int[] breakdown = new int[10];

        for(int score : scores){
            breakdown[Math.min(score / 10, 9)]++;
        }

        return breakdown;
    }

    public static void printHistogram(int[] counts){
        int displayBeg = 0;

        for(int i = 0; i < counts.length; i++){
            String interval = displayBeg + "-";
            interval += displayBeg == 90 ? displayBeg + 10 : (displayBeg + 9);

            displayBeg += 10;

            String stars = "*".repeat(counts[i]);

            System.out.printf("%-6s%3s|  %-20s%d%n", interval, "", stars, counts[i]);
        }
    }
}
