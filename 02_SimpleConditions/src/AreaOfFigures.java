import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        double side1 = scanner.nextDouble();
        double area = 0;

        switch(shape) {
            case "square":
                area = side1 * side1;
                break;
            case "rectangle":
                double side2 = scanner.nextDouble();
                area = side1 * side2;
                break;
            case "circle":
                area = Math.PI * side1 * side1;
                break;
            case "triangle":
                side2 = scanner.nextDouble();
                area = side1 * side2 / 2;
        }

        System.out.printf(" %.3f%n" ,area);
    }
}
