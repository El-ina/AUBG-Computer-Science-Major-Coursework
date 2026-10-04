import java.util.Scanner;

public class Question9 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a card number as a long integer: ");
        long number = scanner.nextLong();

        System.out.println(number + " is " + (isValid(number) ? "valid" : "invalid"));
    }

    public static boolean isValid(long number){
        boolean valid = false;

        if(((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0)){
            if(getSize(number) >= 13 && getSize(number) <= 16){
                if(prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 6) || getPrefix(number, 2) == 37){
                    valid = true;
                }
            }
        }

        return valid;
    }

    public static int sumOfDoubleEvenPlace(long number){
        char[] numAsArray = String.valueOf(number).toCharArray();
        int length = numAsArray.length;

        int sum = 0;

        for(int i = length - 1; i >= 0; i--){
            int index = length - i;
            if(index % 2 == 0){
                sum += getDigit(Integer.parseInt(String.valueOf(numAsArray[i])) * 2);
            }
        }

        return sum;
    }

    public static int getDigit(int number){
        int retVal = number;

        while (retVal > 9){
            retVal = retVal % 10 + retVal / 10;
        }

        return retVal;
    }

    public static int sumOfOddPlace(long number){
        char[] numAsArray = String.valueOf(number).toCharArray();
        int length = numAsArray.length;

        int sum = 0;

        for(int i = length - 1; i >= 0; i--){
            int index = length - i;
            if(index % 2 != 0){
                sum += Integer.parseInt(String.valueOf(numAsArray[i]));
            }
        }

        return sum;
    }

    public static boolean prefixMatched(long number, int d){
        return getPrefix(number, getSize(d)) == d;
    }

    public static int getSize(long d){
        char[] numAsArray = String.valueOf(d).toCharArray();
        return numAsArray.length;
    }

    public static long getPrefix(long number, int k){
        StringBuilder prefix = new StringBuilder();
        char[] numAsArray = String.valueOf(number).toCharArray();

        for(int i = 0; i < k; i++){
            prefix.append(numAsArray[i]);
        }

        return Long.parseLong(prefix.toString());
    }
}
