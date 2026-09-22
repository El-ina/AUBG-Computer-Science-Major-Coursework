import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class Question12 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        char[] str = scanner.nextLine().toLowerCase().toCharArray();
        StringBuilder clearStr = new StringBuilder();

        for(int i = 0; i < str.length; i++){
            if(str[i] >= 'a' && str[i] <= 'z'){
                clearStr.append(str[i]);
            }
        }

        int p1 = 0;
        int p2 = clearStr.length() - 1;

        boolean isPalindrome = true;
        while(p1 <= p2){
            if(clearStr.charAt(p1) != clearStr.charAt(p2)){
                isPalindrome = false;
                break;
            }
            p1++;
            p2--;
        }

        if(isPalindrome) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");
    }
}
