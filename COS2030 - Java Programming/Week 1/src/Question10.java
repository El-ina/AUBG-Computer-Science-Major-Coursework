import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Original: ");
        double originalValue = scanner.nextDouble();

        System.out.println("As int: " + (int)originalValue);

        String decimalAsStr = String.valueOf(originalValue);
        StringBuilder truncatedToTwoValues = new StringBuilder();

        Boolean dotFound = false;
        byte counter = 0;
        for(int i = 0; i <= decimalAsStr.length(); i++){
            truncatedToTwoValues.append(decimalAsStr.toCharArray()[i]);

            if(dotFound){
                counter++;
            }

            if(counter == 2){
                break;
            }

            if(decimalAsStr.toCharArray()[i] == '.'){
                dotFound = true;
            }
        }

        System.out.println("Truncated to 2 decimals: " + truncatedToTwoValues);
    }
}
