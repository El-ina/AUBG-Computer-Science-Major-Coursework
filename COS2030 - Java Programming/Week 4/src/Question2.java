import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];

        System.out.print("Enter " + length + " values: ");
        for(int i = 0; i < length; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.printf("reverse:%40s%n", Arrays.toString(reverse(arr)));
        System.out.printf("original after it:%30s%n", Arrays.toString(arr));
        System.out.printf("palindrome?%21b / %b%n", isPalindrome(arr), isPalindromeInPlace(arr));
        System.out.printf("after reverseInPlace:%27s%n", Arrays.toString(arr));


    }

    public static int[] reverse(int[] list){
        int len = list.length;
        int[] revList = new int[len];


        for(int i = len - 1; i >= 0; i--){
            revList[len - i - 1] = list[i];
        }

        return revList;
    }

    public static void reverseInPlace(int[] list){
        int startingPointer = 0;
        int endingPointer = list.length - 1;

        while (startingPointer < endingPointer){
            int tmp = list[startingPointer];
            list[startingPointer] = endingPointer;
            list[endingPointer] = tmp;

            startingPointer++;
            endingPointer--;
        }
    }

    public static boolean isPalindrome(int[] list){
        return Arrays.equals(list, reverse(list));
    }

    public static boolean isPalindromeInPlace(int[] list){
        int startingPointer = 0;
        int endingPointer = list.length - 1;

        boolean isPalindrome = true;

        while (startingPointer < endingPointer){
            if(list[startingPointer] != list[endingPointer]){
                isPalindrome = false;
                break;
            }

            startingPointer++;
            endingPointer--;
        }

        return isPalindrome;
    }
}
