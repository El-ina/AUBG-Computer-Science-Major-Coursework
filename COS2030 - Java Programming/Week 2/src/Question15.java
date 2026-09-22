import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Question15 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Character> vowelsList = Arrays.asList('a', 'e', 'i', 'o', 'u');

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        while(!Objects.equals(input, "END")){
            for(int i = 0; i < input.length(); i++){
                char currentLetter = input.charAt(i);

                if(vowelsList.contains(currentLetter)) vowels++;
                else if(Character.isLetter(currentLetter)) consonants++;
                else if(Character.isDigit(currentLetter)) digits++;
                else if(Character.isSpaceChar(currentLetter)) spaces++;
            }

            input = scanner.nextLine();
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}
