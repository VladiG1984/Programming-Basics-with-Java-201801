import java.util.Scanner;
import java.text.DecimalFormat;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side = scanner.nextDouble();
        double height = scanner.nextDouble();

        System.out.printf("Triangle area = %.2f%n", side * height / 2);
    }

}
