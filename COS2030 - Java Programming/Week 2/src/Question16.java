import java.util.Scanner;

public class Question16 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int row = 1; row <= n; row++){
            int spaces = n - row;
            for(int i = 1; i <= spaces; i++) System.out.print("  ");

            if(row == 1) System.out.print(row + " ");

            else if(row != 1){
                for(int i = 1; i <= row; i++){
                    System.out.print(i + " ");
                }
                for(int i = row - 1; i >= 1; i--){
                    System.out.print(i + " ");
                }
            }

            System.out.println();
        }
    }
}
