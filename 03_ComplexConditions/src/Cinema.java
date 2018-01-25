import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projectionType = scanner.nextLine();
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        double price = 0;

        if (projectionType.equals("Premiere")) {
            price = rows * cols * 12.00;
        } else if (projectionType.equals("Normal")) {
            price = rows * cols * 7.50;
        } else if (projectionType.equals("Discount")) {
            price = rows * cols * 5.00;
        }
        System.out.printf("%.2f leva", price);
    }
}
