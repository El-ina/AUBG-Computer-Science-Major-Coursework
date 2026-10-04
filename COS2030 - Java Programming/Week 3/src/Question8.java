public class Question8 {
    static void main() {
        printRow(2);
        printRow(3);
        printRow(10);
        printRow(144);
        printRow(0.0625);
        printRow(1e10);
    }

    public static double sqrt(double n){
        double guess = 1.0;
        double next = (guess + n / guess) / 2;
        while (next != guess) {
            guess = next;
            next = (guess + n / guess) / 2;
        }
        return guess;
    }

    static void printRow(double n) {
        System.out.printf("%6s %-20s%-20s%s%n", "n", "sqrt(n)", "Math.sqrt(n)", "same?");

        double[] values = {2, 3, 10, 144, 0.0625, 1e10};
        for (double number : values) {
            double mine = sqrt(number);
            double real = Math.sqrt(number);
            System.out.printf("%6s %-30s%-30s%s%number", number, mine, real, mine == real);
        }
    }
}
