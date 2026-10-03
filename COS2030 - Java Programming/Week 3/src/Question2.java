import java.util.Scanner;

public class Question2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of courses: ");
        int coursesCount = scanner.nextInt();

        double weighedCreditSum = 0;
        int totalCredits = 0;

        for(int i = 1; i <= coursesCount; i++){
            System.out.print("Credits and score for course " + i + ": ");
            int credits = scanner.nextInt();
            double score = scanner.nextDouble();

            String grade = letterGrade(score);
            double gradePoints = gradePoints(grade);

            System.out.printf("\t%s (%.2f)%n", grade, gradePoints);

            totalCredits += credits;
            weighedCreditSum += gradePoints * credits;
        }

        double gpa = weighedCreditSum / totalCredits;

        System.out.print("GPA over " + totalCredits + " credits: ");
        System.out.printf("%.2f%n", gpa);
    }

    public static String letterGrade(double score){
        String grade;

        if(score >= 96){
            grade = "A";
        }

        else if(score >= 90){
            grade = "A-";
        }

        else if(score >= 86){
            grade = "B+";
        }

        else if(score >= 83){
            grade = "B";
        }

        else if(score >= 80){
            grade = "B-";
        }

        else if(score >= 76){
            grade = "C+";
        }

        else if(score >= 73){
            grade = "C";
        }

        else if(score >= 70){
            grade = "C-";
        }

        else if(score >= 65){
            grade = "D+";
        }

        else if(score >= 60){
            grade = "D";
        }

        else{
            grade = "F";
        }

        return grade;
    }

    public static double gradePoints(String letter){
        double gradePoints = switch (letter){
          case "A" -> 4.00;
          case "A-" -> 3.67;
          case "B+" -> 3.33;
          case "B" -> 3.00;
          case "B-" -> 2.67;
          case "C+" -> 2.33;
          case "C" -> 2.00;
          case "C-" -> 1.67;
          case "D+" -> 1.33;
          case "D" -> 1.00;
          case "F" -> 0.00;
          default -> -1; // noop
        };

        return gradePoints;
    }
}
