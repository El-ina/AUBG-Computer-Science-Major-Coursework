import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.lang.classfile.instruction.DiscontinuedInstruction;
import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double DISCOUNT_RATE = 0.1;
        final double VAT_RATE = 0.2;
        final String CURRENCY_SYMBOL = "EUR";

        System.out.print("Enter list price: ");
        double listPrice = scanner.nextDouble();

        double afterDiscountPrice = (1 - DISCOUNT_RATE) * listPrice;
        double vatValue = VAT_RATE * afterDiscountPrice;
        double total = afterDiscountPrice + vatValue;

        System.out.printf("List price: %.2f " + CURRENCY_SYMBOL + "\n", listPrice);
        System.out.printf("After discount: %.2f " + CURRENCY_SYMBOL + "\n", afterDiscountPrice);
        System.out.printf("VAT: %.2f " + CURRENCY_SYMBOL + "\n", vatValue);
        System.out.printf("Total: %.2f " + CURRENCY_SYMBOL + "\n", total);
    }
}
