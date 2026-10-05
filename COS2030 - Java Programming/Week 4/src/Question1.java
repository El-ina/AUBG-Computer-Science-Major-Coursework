import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();
        double[] numbers = new double[n];

        System.out.print("Enter " + n + " values: ");

        for(int i = 0; i < n; i++){
            numbers[i] = scanner.nextDouble();
        }

        System.out.printf("Mean: %.2f%n", mean(numbers));
        System.out.printf("Standard deviation: %.2f%n", standardDeviation(numbers));
        System.out.printf("Smallest: %.1f%n", min(numbers));
        System.out.printf("Largest: %.1f%n", max(numbers));
        System.out.println("Above the mean: " + countAbove(numbers, mean(numbers)) + " of " + numbers.length);
    }

    public static double mean(double[] numbers){
        double sum = Arrays.stream(numbers).sum();
        int count = numbers.length;

        return sum / count;
    }

    public static double standardDeviation(double[] numbers){
        double mean = mean(numbers);
        double numerator = 0;
        int denominator = numbers.length - 1;

        for(double number : numbers){
            numerator += Math.pow(number - mean, 2);
        }

        double standardDeviation = Math.sqrt(numerator / denominator);

        return standardDeviation;
    }

    public static double min(double[] numbers){
        double min = Double.MAX_VALUE;

        for (double number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        return min;
    }

    public static double max(double[] numbers){
        double max = Double.MIN_VALUE;

        for(double number : numbers){
            if(number > max){
                max = number;
            }
        }

        return max;
    }

    public static int countAbove(double[] numbers, double threshold){
        int countAboveMean = 0;

        for(double number : numbers){
            if(number > threshold){
                countAboveMean++;
            }
        }

        return countAboveMean;
    }
}
