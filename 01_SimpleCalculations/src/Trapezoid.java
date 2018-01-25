import java.util.Scanner;

public class Trapezoid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double b1 = Double.parseDouble(scanner.nextLine());
        Double b2 = Double.parseDouble(scanner.nextLine());
        Double h = Double.parseDouble(scanner.nextLine());
        Double area = ((b1 + b2) / 2) * h;
        System.out.println("Trapezoid area = " + area);

    }

}
