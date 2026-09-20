import java.util.Scanner;

public class Question2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start year and end year: ");
        int startYear = scanner.nextInt();
        int endYear = scanner.nextInt();

        int rowValueCounter = 0;

        for(int i = startYear; i <= endYear; i++){
            if(rowValueCounter >= 10){
                System.out.println();
                rowValueCounter = 0;
            }

            if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)){
                System.out.print(i + " ");
                rowValueCounter++;
            }
        }
    }
}
