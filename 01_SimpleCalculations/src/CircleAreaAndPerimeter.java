import java.util.Scanner;

public class CircleAreaAndPerimeter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter circle radius. r = ");
        double r = Double.parseDouble(scanner.nextLine());

        System.out.println("Area = " + Math.PI * r * r);
        System.out.println("Pemimeter = " + 2 * Math.PI * r);

    }

}
