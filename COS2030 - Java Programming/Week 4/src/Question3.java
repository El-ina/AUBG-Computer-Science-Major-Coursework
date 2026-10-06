import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i <= 9; i++){
            arr[i] = scanner.nextInt();
        }

        int[] distinct = distinct(arr);

        System.out.println("Distinct values: " + Arrays.toString(distinct));

        System.out.println(distinct.length + " of 10 values are distinct");
    }

    public static int[] distinct(int[] list){
        int[] distinctVals = new int[list.length];
        int i = 0;

        for(int number : list){
            if(!contains(distinctVals, i, number)){
                distinctVals[i] = number;
                i++;
            }
        }

        int[] returnArr = Arrays.copyOf(distinctVals, i);

        return returnArr;
    }

    public static boolean contains(int[] list, int size, int key) {
        for (int j = 0; j < size; j++) {
            if (list[j] == key) return true;
        }
        return false;
    }


}

