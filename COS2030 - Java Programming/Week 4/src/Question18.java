import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;

public class Question18 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line: ");
        String raw = scanner.nextLine();
        String encoded = encode(raw);
        String decoded = decode(encoded);

        System.out.println("Encoded: " + encoded);
        System.out.println("Length " + raw.length() + " -> " + encoded.length());
        System.out.println("Round trip: " + raw.equals(decoded));
    }

    public static String encode(String s){
        StringBuilder encoded = new StringBuilder();
        char streak = s.charAt(0);
        int count = 1;

        if(s.length() == 1){
            encoded.append(String.format("%c%d", streak, count));
            return encoded.toString();
        }


        for(int i = 1; i < s.length(); i++){
            char cur = s.charAt(i);
            if(cur == streak){
                count++;
            }
            else{
                encoded.append(String.format("%c%d", streak, count));
                streak = cur;
                count = 1;
            }
        }

        encoded.append(String.format("%c%d", streak, count));
        return encoded.toString();
    }

    public static String decode(String s) {
        StringBuilder decoded = new StringBuilder();
        int index = 0;

        while (index < s.length()) {
            char c = s.charAt(index);
            index++;

            int start = index;
            while (index < s.length() && Character.isDigit(s.charAt(index))) {
                index++;
            }
            int count = Integer.parseInt(s.substring(start, index));

            decoded.repeat(c, count);
        }

        return decoded.toString();
    }
}
