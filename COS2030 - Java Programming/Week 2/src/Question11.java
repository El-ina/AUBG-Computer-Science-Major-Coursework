import java.util.Scanner;

public class Question11 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        int rowItemsCounter = 0;

        if(k == 1){
            System.out.println(2);
            k -= 1;
        }
        else if(k >= 2){
            System.out.print(2 + " " + 3 + " ");
            k -= 2;
        }

        rowItemsCounter = 2;

        int currNumber = 5;

        while(k > 0){
            int divisorsCounter = 0;

            for(int i = 1; i <= currNumber; i++){
                if(currNumber % i == 0) divisorsCounter++;
            }

            if(divisorsCounter == 2) {
                if(rowItemsCounter == 10){
                    System.out.println();
                    rowItemsCounter = 0;
                }

                System.out.print(currNumber + " ");
                rowItemsCounter++;
                k--;
            }

            currNumber++;
        }
    }
}
