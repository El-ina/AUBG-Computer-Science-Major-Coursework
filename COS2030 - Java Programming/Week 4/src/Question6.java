import java.util.Arrays;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();
        int[] list = new int[n];
        System.out.print("Enter " + n + " values: ");
        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }

        int[] librarySorted = Arrays.copyOf(list, n);
        selectionSort(list);
        Arrays.sort(librarySorted);

        System.out.println("Sorted: " + Arrays.toString(list));
        System.out.println("Same as Arrays.sort: " + Arrays.equals(list, librarySorted));

        for (int t = 0; t < 2; t++) {
            System.out.print("Enter a key to search for: ");
            int key = scanner.nextInt();
            int result = binarySearch(list, key);
            if (result >= 0) {
                System.out.println(key + " is at index " + result);
            } else {
                System.out.println(key + " is not there: binarySearch returned " + result
                        + ", so it belongs at index " + (-result - 1));
            }
        }

        int disagreements = 0;
        for (int key = 0; key <= 100; key++) {
            if (binarySearch(list, key) != Arrays.binarySearch(list, key)) {
                disagreements++;
            }
        }
        System.out.println("Keys 0 to 100 against Arrays.binarySearch: " + disagreements + " disagreements");
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -low - 1;
    }
}