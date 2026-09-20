import java.util.Scanner;

public class Question3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integers, 0 to finish: ");
        int input = scanner.nextInt();

        if(input == 0){
            System.out.println("No statistics to be generated - zero dataset!");
            System.exit(1);
        }

        int count = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int negatives = 0;

        while(input != 0){
            count++;
            sum += input;

            if(input < 0) negatives++;
            if(input < min) min = input;
            if(input > max) max = input;

            input = scanner.nextInt();
        }

        double average = (double) sum / count;

        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Negatives: " + negatives);
    }
}
