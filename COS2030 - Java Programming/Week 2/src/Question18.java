import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.Map;
import java.util.Scanner;

public class Question18 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int studentsCount = scanner.nextInt();

        Map<Character, Integer> gradesMap = new java.util.HashMap<>(Map.of('A', 0, 'B', 0, 'C', 0, 'D', 0, 'F', 0));

        for(int i = 1; i <= studentsCount; i++){
            byte gradeScore = scanner.nextByte();
            char letterGrade;

            if(gradeScore >= 90) letterGrade = 'A';
            else if(gradeScore >= 80) letterGrade = 'B';
            else if(gradeScore >= 70) letterGrade = 'C';
            else if(gradeScore >= 60) letterGrade = 'D';
            else letterGrade = 'F';

            gradesMap.compute(letterGrade, (k, currentGradeCount) -> currentGradeCount + 1);
        }

        gradesMap.forEach((key, value) -> System.out.println(key + ": " + value + " " + "*".repeat(value)));
    }
}
