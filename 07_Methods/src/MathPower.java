import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    static double raiseToPower(double number, double power) {
        double result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());
        DecimalFormat format = new DecimalFormat("#.######");

        System.out.println(format.format(raiseToPower(number, power)));
    }

}
