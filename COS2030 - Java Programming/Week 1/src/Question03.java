import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius (cm): ");

        byte radius = scanner.nextByte();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Pizza area is %.3f cm^2", area);
    }
}
