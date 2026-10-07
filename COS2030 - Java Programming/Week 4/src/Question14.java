import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Question14 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter records as surname, firstname ; course ; score\nand END to finish");

        List<String[]> students = new ArrayList<>();
        double sumScores = 0;
        int count = 0;

        String input = scanner.nextLine();
        while (!Objects.equals(input, "END")){
            String[] data = new String[5];

            String[] tokens = input.split(";");
            String[] names = tokens[0].split(",");

            data[0] = names[1].strip();
            data[1] = names[0].strip();
            data[2] = tokens[1].strip();

            double score = Double.parseDouble(tokens[2].strip());
            sumScores += score;
            count++;

            data[3] = String.valueOf(score);
            data[4] = getGrade(score);

            students.add(data);
            input = scanner.nextLine();
        }

        for(String[] student : students){
            System.out.printf("%s %s (%s): %s, %s%n", student[0], student[1], student[2], student[3], student[4]);
        }

        double average = sumScores / count;

        System.out.printf("%d records, average %.2f%n", count, average);





    }

    public static String getGrade(double score) {
        if (score < 60.0) return "F";
        if (score >= 100.0) return "A+";

        char letter;
        if (score >= 90.0) letter = 'A';
        else if (score >= 80.0) letter = 'B';
        else if (score >= 70.0) letter = 'C';
        else letter = 'D';

        double lastDigit = score % 10;
        if (lastDigit >= 7) return letter + "+";
        if (lastDigit < 3)  return letter + "-";
        return String.valueOf(letter);
    }
}
