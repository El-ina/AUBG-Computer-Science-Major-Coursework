import java.util.Scanner;

public class Question15 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sales for January to June: ");

        for(int i = 1; i <= 6; i++){
            double sales = scanner.nextDouble();
            String month = monthName(i);

            printBar(month, sales, 100);
        }

        System.out.println("Each # is 100 EUR");
    }

    public static void printBar(String label, double value, double unit){
        int poundsCount = Math.toIntExact(Math.round(value / unit));
        String pounds = "#".repeat(poundsCount);

        System.out.printf("%-5s| %-30s%.2f%n", label, pounds, value);
    }

    public static String monthName(int month){
        return switch(month){
            case 1 -> "Jan";
            case 2 -> "Feb";
            case 3 -> "Mar";
            case 4 -> "Apr";
            case 5 -> "May";
            case 6 -> "Jun";
            case 7 -> "Jul";
            case 8 -> "Aug";
            case 9 -> "Sept";
            case 10 -> "Oct";
            case 11 -> "Nov";
            case 12 -> "Dec";
            default -> "noop";
        };
    }
}
