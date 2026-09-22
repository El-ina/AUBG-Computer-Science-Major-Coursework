import java.util.Scanner;

public class Question17 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        int[] rowSums = new int[rows];
        int[] colSums = new int[cols];

        for(int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                int number = scanner.nextInt();

                if(number < -1000 || number > 1000){
                    System.out.println("Invalid value!");
                    System.exit(1);
                }

                matrix[i][j] = number;

                rowSums[i] += number;
                colSums[j] += number;
            }
        }

        System.out.print("Row sums: ");
        for(int i = 0; i < rows; i++) System.out.print(rowSums[i] + " ");

        System.out.println();

        System.out.print("Col sums: ");
        for(int i = 0; i < cols; i++) System.out.print(colSums[i] + " ");
    }
}
