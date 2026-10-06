import java.util.Arrays;
import java.util.Scanner;

public class Question9 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int[][] a = new int[3][3];
        System.out.println("Enter matrix A (3 x 3):");

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                a[i][j] = scanner.nextInt();
            }
        }

        int[][] b = new int[3][3];
        System.out.println("Enter matrix B (3 x 3):");

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                b[i][j] = scanner.nextInt();
            }
        }

        int[][] sum = add(a, b);

        System.out.println("A + B:");
        print(sum);

        int[][] product = multiply(a, b);

        System.out.println("A x B:");
        print(product);

        boolean equality = Arrays.deepEquals(transpose(product), multiply(transpose(b), transpose(a)));
        System.out.println("(A x B) transposed equals B^T x A^T: " + equality);

        equality = Arrays.deepEquals(multiply(a, b), multiply(b, a));
        System.out.println("A x B equals B x A: " + equality);

    }

    public static int[][] add(int[][] a, int[][] b){
        int[][] c = new int[a.length][a.length];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        return c;
    }

    public static int[][] multiply(int[][] a, int [][] b){
        int m = a.length;
        int n = b.length;
        int p = b[0].length;

        int[][] c = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return c;
    }

    public static int[][] transpose(int[][] m){
        int rows = m.length;
        int cols = m[0].length;

        int[][] t = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                t[j][i] = m[i][j];
            }
        }
        return t;
    }

    public static void print(int[][] m){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                System.out.printf("%5d", m[i][j]);
            }
            System.out.println();
        }
    }
}
