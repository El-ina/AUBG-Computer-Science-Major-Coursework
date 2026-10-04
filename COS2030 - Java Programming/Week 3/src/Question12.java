import java.util.Scanner;

public class Question12 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year, month and day: ");

        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        int dayOfWeek = dayOfWeek(year, month, day);
        String dayName = dayName(dayOfWeek);

        System.out.println(day + "." + month + "." + year + " is a " + dayName);
    }

    public static int dayOfWeek(int year, int month, int day){
        int q = day;
        int m = month;

        if (m < 3) {
            m += 12;
            year--;
        }

        int j = year / 100;
        int k = year % 100;

        int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        return h;
    }

    public static String dayName(int h){
        return switch (h){
          case 0 -> "Saturday";
          case 1 -> "Sunday";
          case 2 -> "Monday";
          case 3 -> "Tuesday";
          case 4 -> "Wednesday";
          case 5 -> "Thursday";
          case 6 -> "Friday";
          default -> "noop";
        };
    }
}
