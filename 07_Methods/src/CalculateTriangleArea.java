import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateTriangleArea {
    static double getTriangleArea(double side, double height) {
        double triangleArea = side * height / 2;
        return triangleArea;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        DecimalFormat format = new DecimalFormat("#.#########");

        System.out.println(format.format(getTriangleArea(side, height)));
    }
}
