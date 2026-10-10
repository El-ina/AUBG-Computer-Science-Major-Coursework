import java.util.Arrays;
import java.util.Scanner;

public class Question17 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");

        String[] sentence = scanner.nextLine().split("\\s+");
        System.out.println("Words: " + sentence.length);

        longest(sentence);
        System.out.printf("Average length: %.2f%n", averageLength(sentence));
        System.out.println("Reversed: " + reverseOrder(sentence));
    }

    static void longest(String[] sentence){
        int longestLen = Integer.MIN_VALUE;
        String longestWord = "";

        for(String word : sentence){
            int len = word.length();

            if(len > longestLen){
                longestLen = len;
                longestWord = word;
            }
        }

        System.out.println("Longest: " + longestWord + " (" + longestLen + " letters)");
    }

    static double averageLength(String[] sentence){
        int count = sentence.length;
        double sumLens = 0;

        for(String word : sentence){
            sumLens += word.length();
        }

        double average = sumLens / count;
        return average;
    }

    static String reverseOrder(String[] sentence){
        String[] reverse = new String[sentence.length];

        for(int i = sentence.length - 1; i >= 0; i--){
            reverse[sentence.length - 1 - i] = sentence[i];
        }

        StringBuilder reverseAsStr = new StringBuilder();
        for(String word : reverse) reverseAsStr.append(word + " ");

        return reverseAsStr.toString();
    }
}
