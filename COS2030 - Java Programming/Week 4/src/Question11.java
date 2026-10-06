import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] regions = {"Sofia", "Plovdiv", "Varna", "Burgas"};
        double[][] sales = new double[4][4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Sales for " + regions[i] + " (Q1-Q4): ");
            for (int j = 0; j < 4; j++) {
                sales[i][j] = scanner.nextDouble();
            }
        }

        double[] rowSums = rowTotals(sales);
        double[] colSums = columnTotals(sales);

        System.out.printf("%-8s%8s%8s%8s%8s%9s%n", "Region", "Q1", "Q2", "Q3", "Q4", "Total");

        for (int i = 0; i < 4; i++) {
            System.out.printf("%-8s", regions[i]);
            for (int j = 0; j < 4; j++) {
                System.out.printf("%8.1f", sales[i][j]);
            }
            System.out.printf("%9.1f%n", rowSums[i]);
        }

        double grandTotal = 0;
        System.out.printf("%-8s", "Total");
        for (int j = 0; j < 4; j++) {
            System.out.printf("%8.1f", colSums[j]);
            grandTotal += colSums[j];
        }
        System.out.printf("%9.1f%n", grandTotal);

        int[] largest = locateLargest(sales);
        int r = largest[0];
        int c = largest[1];
        System.out.println("Largest single figure: " + sales[r][c] + " (" + regions[r] + ", Q" + (c + 1) + ")");
        System.out.println("Best region: " + regions[indexOfMax(rowSums)]);
        System.out.println("Best quarter: Q" + (indexOfMax(colSums) + 1));
    }

    public static double[] rowTotals(double[][] m) {
        double[] totals = new double[m.length];
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                totals[row] += m[row][col];
            }
        }
        return totals;
    }

    public static double[] columnTotals(double[][] m) {
        double[] totals = new double[m[0].length];
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                totals[col] += m[row][col];
            }
        }
        return totals;
    }

    public static int indexOfMax(double[] values) {
        int indexOfMax = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] > values[indexOfMax]) {
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }

    public static int[] locateLargest(double[][] m) {
        int maxRow = 0;
        int maxCol = 0;
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                if (m[row][col] > m[maxRow][maxCol]) {
                    maxRow = row;
                    maxCol = col;
                }
            }
        }
        return new int[] {maxRow, maxCol};
    }
}