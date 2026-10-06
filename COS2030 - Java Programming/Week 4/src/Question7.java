import java.util.Arrays;

public class Question7 {
    static final int TRIALS = 600_000;
    static final int[][] ORDERS = {
            {1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}
    };

    public static void main(String[] args) {
        System.out.println("The slide's shuffle (j from 0 to n - 1):");
        int[] counts = new int[6];
        for (int t = 0; t < TRIALS; t++) {
            int[] a = {1, 2, 3};
            slideShuffle(a);
            counts[orderIndex(a)]++;
        }
        printCounts(counts);

        System.out.println("Fisher-Yates (j from 0 to i):");
        counts = new int[6];
        for (int t = 0; t < TRIALS; t++) {
            int[] a = {1, 2, 3};
            fisherYates(a);
            counts[orderIndex(a)]++;
        }
        printCounts(counts);
    }

    public static void slideShuffle(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int j = (int) (Math.random() * list.length);
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }

    public static void fisherYates(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int j = (int) (Math.random() * (i + 1));
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }

    public static int orderIndex(int[] a) {
        return (a[0] - 1) * 2 + (a[1] < a[2] ? 0 : 1);
    }

    public static void printCounts(int[] counts) {
        for (int k = 0; k < 6; k++) {
            System.out.printf("  %s%8d  %.2f%%%n",
                    Arrays.toString(ORDERS[k]), counts[k], 100.0 * counts[k] / TRIALS);
        }
    }
}
