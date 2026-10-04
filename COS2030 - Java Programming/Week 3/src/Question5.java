import java.util.Scanner;

public class Question5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three sides: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if(!isValid(a, b, c)){
            System.out.println("Not a triangle");
        }

        else{
            System.out.println("Triangle: " + classify(a, b, c) + ", " + (isRight(a, b, c) ? "right-angled" : "not right-angled"));
            System.out.printf("Area: %.2f%n", area(a, b, c));
        }
    }

    public static boolean isValid(double a, double b, double c){
        return (a < b + c && b < a + c && c < a + b);
    }

    public static double area(double a, double b, double c){
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        return area;
    }

    public static String classify(double a, double b, double c){
        if(a == b && b == c) return "equilateral";
        else if(a == b || b == c || c == a) return "isosceles";
        return "scalene";
    }

    public static boolean isRight(double a, double b, double c){
        return (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2));
    }
}
