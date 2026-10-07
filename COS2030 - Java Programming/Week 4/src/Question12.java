import java.util.Scanner;

public class Question12 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        int[][] pascalTriangle = new int[n][];
        int[] rowSums = new int[n];

        for(int i = 0; i < pascalTriangle.length; i++){
            int[] row = new int[i + 1];
            if(i == 0){
                row[i] = 1;
            }

            else if(i == 1){
                row[i - 1] = 1;
                row[i] = 1;
            }

            else{
                row[0] = 1;

                for(int j = 1; j < i; j++){
                    row[j] = pascalTriangle[i - 1][j] + pascalTriangle[i - 1][j - 1];
                }

                row[i] = 1;
            }

            pascalTriangle[i] = row;
            rowSums[i] = sum(row);
        }

        printTriangle(pascalTriangle);
        printData(rowSums, pascalTriangle);
    }

    public static int sum(int[] row){
        int sum = 0;

        for(int number : row){
            sum += number;
        }

        return sum;
    }

    public static void printTriangle(int[][] triangle){
        for(int[] row : triangle){
            for(int member : row){
                System.out.print(member + " ");
            }

            System.out.println();
        }
    }

    public static void printData(int[] rowSums, int[][] triangle){
        System.out.print("Row sums: ");
        for(int number : rowSums){
            System.out.print(number + " ");
        }
        System.out.println();

        int len = triangle.length;
        System.out.println("triangle.length is " + len + ", triangle[" + (len - 1) + "].length is " + triangle[len - 1].length);
    }
}
