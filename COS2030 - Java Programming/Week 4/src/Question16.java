import java.util.Scanner;

public class Question16 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of input: ");
        String word = scanner.nextLine();
        String filteredWord = lettersAndDigits(word);

        System.out.println("Filtered: " + filteredWord);
        System.out.println(isPalindrome(filteredWord) ? "Palindrome" : "Not a palindrome");
    }

    public static String lettersAndDigits(String s){
        StringBuilder filtered = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                filtered.append(Character.toLowerCase(c));
            }
        }

        return filtered.toString();
    }

    public static boolean isPalindrome(String str){
        int startingPtr = 0;
        int endingPtr = str.length() - 1;

        char[] strTraversable = str.toCharArray();

        while(startingPtr < endingPtr){
            if(strTraversable[startingPtr] != strTraversable[endingPtr]) return false;
            startingPtr++;
            endingPtr--;
        }

        return true;
    }
}
