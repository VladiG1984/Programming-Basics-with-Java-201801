import java.util.Scanner;

public class DrawAFilledSquare {
    static void printHeaderFooter(int n) {
        for (int col = 0; col < 2 * n; col++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static void printBody(int n) {
        for (int row = 0; row < n - 2; row++) {
            System.out.print("-");
            for (int col = 0; col < n - 1; col++) {
                System.out.print("\\/");
            }
            System.out.println("-");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        printHeaderFooter(n);
        printBody(n);
        printHeaderFooter(n);
    }
}
