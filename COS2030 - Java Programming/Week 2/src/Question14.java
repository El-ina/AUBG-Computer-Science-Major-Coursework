import java.util.Scanner;

public class Question14 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight (kg) and height (m): ");

        double kg = scanner.nextDouble();
        double m = scanner.nextDouble();

        double bmi = kg / Math.pow(m, 2);
        System.out.println("BMI: " + bmi);
        System.out.print("Category: ");

        if(bmi >= 30) System.out.print("Obese");
        else if(bmi >= 25) System.out.print("Overweight");
        else if(bmi >= 18.5) System.out.print("Normal");
        else System.out.print("Underweight");
    }
}
