import java.util.Scanner;

public class PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        boolean isOnBorder = (x == x1 && y >= y1 && y <= y2) || (x == x2 && y >= y1 && y <= y2) ||
                (y == y1 && x >= x1 && x <= x2) || (y == y2 && x >= x1 && x <= x2);
        //boolean isInside = x >= x1 && x <= x2 && y >= y1 && y <= y2;

        if (isOnBorder) {
            System.out.println("Border");
        } //else if (isInside) {
           // System.out.println("Inside");
        //}
        else {
            System.out.println("Inside / Outside");
        }
    }
}
