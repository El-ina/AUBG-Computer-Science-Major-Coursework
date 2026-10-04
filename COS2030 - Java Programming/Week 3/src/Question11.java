import java.util.Scanner;

public class Question11 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        long number = scanner.nextLong();

        int maxStepsCount = 0;
        long maxStepsNum = 0;

        long highestValueReached = 0;
        long highestValueNum = 0;


        for(long i = number - 1; i >= 1; i--){
            int steps = steps(i);
            long maxValueReached = peak(i);

            if(steps > maxStepsCount){
                maxStepsCount = steps;
                maxStepsNum = i;
            }

            if(maxValueReached > highestValueReached){
                highestValueReached = maxValueReached;
                highestValueNum = i;
            }
        }

        System.out.println("Most steps below " + number + ": " + maxStepsNum + " (" + maxStepsCount + " steps)");
        System.out.println("Highest value reached: " + highestValueReached + " (starting from " + highestValueNum + ")");

    }

    public static long next(long n){
        if(n % 2 == 0) return n / 2;
        else return 3 * n + 1;
    }

    public static int steps(long n){
        int steps = 0;

        while(n != 1){
            n = next(n);
            steps++;
        }

        return steps;
    }

    public static long peak(long n){
        long maxValue = Long.MIN_VALUE;

        while(n != 1){
            n = next(n);
            if(n > maxValue) maxValue = n;
        }

        return maxValue;
    }
}
