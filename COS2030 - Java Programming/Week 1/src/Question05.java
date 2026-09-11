import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total seconds: ");
        int seconds = scanner.nextInt();
        System.out.print(seconds + " seconds = ");


        int hours, minutes;

        hours = seconds / 3600;
        seconds -= hours * 3600;

        minutes = seconds / 60;
        seconds -= minutes * 60;

        System.out.println(hours + " hour(s), " + minutes + " minute(s), " + seconds + " second(s)");
    }
}
