import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int len = scanner.nextInt();
        int[] arr = new int[len];

        System.out.print("Enter " + len + " values: ");
        for(int i = 0; i < len; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter k: ");
        int k = scanner.nextInt();

        rotateRight(arr, k);

        System.out.print("Right by " + k + ": " + Arrays.toString(arr));
    }

    public static void rotateRight(int[] list, int k) {
        int len = list.length;
        int[] shiftedList = new int[len];

        for (int i = 0; i < len; i++) {
            shiftedList[i] = list[Math.floorMod(i - k, len)];
        }

        System.arraycopy(shiftedList, 0, list, 0, len);
    }
}
