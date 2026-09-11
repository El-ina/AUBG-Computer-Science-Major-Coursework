import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        // Week: 0 1 2 3 4 5 6
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        byte today = scanner.nextByte();

        System.out.print("Enter days in the future: ");
        byte daysIncrement = scanner.nextByte();

        byte futureDay = (byte) ((today + daysIncrement) % 7);
        System.out.print("Future day is: " + futureDay);
    }
}
