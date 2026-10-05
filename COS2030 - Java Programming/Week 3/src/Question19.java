import java.util.Scanner;

public class Question19 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (day month year): ");

        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        if(isValidDate(year, month, day)){
            int dayOfYear = dayOfYear(year, month, day);
            int remainingDays = isLeapYear(year) ? 366 - dayOfYear : 365 - dayOfYear;
            System.out.println(day + "." + month + "." + year + " is day " + dayOfYear + " of " + year + "; " + remainingDays + " days of the year remain");
        }

        else{
            System.out.println(day + "." + month + "." + year + " is not a valid date");
        }
    }

    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static int daysInMonth(int year, int month){
        if(isLeapYear(year)){
            return switch (month){
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> 29;
                default -> 0;
            };
        }

        else{
            return switch (month){
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> 28;
                default -> 0;
            };
        }
    }

    public static boolean isValidDate(int year, int month, int day){
        int daysInMonth = daysInMonth(year, month);
        return day >= 1 && day <= daysInMonth;
    }

    public static int dayOfYear(int year, int month, int day){
        int daysThreasury = 0;

        for(int i = 1; i < month; i++){
            daysThreasury += daysInMonth(year, i);
        }

        daysThreasury += day;

        return daysThreasury;
    }
}
