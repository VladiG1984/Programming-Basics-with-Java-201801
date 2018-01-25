import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String star = "*";
        String space = " ";
        String verticalLn = " | ";

        for (int row = 0; row < n + 1; row++) {
            for (int spaces = n - row; spaces > 0; spaces--) {
                System.out.print(space);
            }
            for (int stars = 0; stars < row; stars++) {
                System.out.print(star);
            }
            System.out.print(verticalLn);
            for (int stars = 0; stars < row; stars++) {
                System.out.print(star);
            }
            for (int spaces = n - row; spaces > 0; spaces--) {
                System.out.print(space);
            }
            System.out.println();
        }

    }
}
