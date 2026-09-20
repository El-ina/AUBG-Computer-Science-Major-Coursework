import java.sql.Array;
import java.util.*;

public class Question5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int award = 0;

        System.out.print("Enter the lottery number (two digits): ");
        char[] lotteryNumber = scanner.nextLine().toCharArray();

        System.out.print("Enter your guess (two digits): ");
        char[] guess = scanner.nextLine().toCharArray();

        for(int i = 0; i < lotteryNumber.length; i++){
            List<Integer> metNumbers = new ArrayList<>(List.of());

            for(int j = 0; j < guess.length; j++){
                if(guess[j] == lotteryNumber[i] && award == 0){
                    metNumbers.add((int)guess[j]);
                    award = 1000;
                }
                else {
                    if(guess[j] == lotteryNumber[i] && award != 0 && !metNumbers.contains((int)guess[j])) award = 3000;
                }
            }
        }

        if(Arrays.equals(lotteryNumber, guess)) award = 10_000;

        System.out.println("Award: " + award);
    }
}
