import java.util.Scanner;

public class PointInTheFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        boolean isInside = ((x > 0 * h && x < 3 * h) && (y > 0 * h && y < 1 * h)) ||
                ((x > 1 * h && x < 2 * h) && (y >= 1 * h && y < 4 * h));
        boolean isOnBorder = (y == 0 * h && x >= 0 && x <= 3 * h) ||
                (y == 1 * h && x >= 0 * h && x <= 1 * h) || (y == 1 * h && x >= 2 * h && x <= 3 * h) ||
                (y == 4 * h && x >= 1 * h && x <= 2 * h) || ((x == 0 * h || x == 3 * h) && (y >= 0 * h && y <= 1 * h)) ||
                ((x == 1 * h || x == 2 * h) && (y >= 1 * h && y <= 4 * h));

        if (isInside) {
            System.out.println("inside");
        } else if (isOnBorder) {
            System.out.println("border");
        } else {
            System.out.println("outside");
        }
    }
}
