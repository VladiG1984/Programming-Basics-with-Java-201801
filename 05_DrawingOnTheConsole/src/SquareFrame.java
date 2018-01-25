import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        String plus = "+";
        String minus = "-";
        String verticalLn = "|";

        for (int i = 1; i <= iterations; i++) {
            if (i == 1 || i == iterations) {
                System.out.print(plus);
            } else {
                System.out.print(verticalLn);
            }

            for (int j = 1; j <= iterations - 2; j++) {
                System.out.print(" " + minus);
            }

            if (i == 1 || i == iterations) {
                System.out.println(" " + plus);
            } else {
                System.out.println(" " + verticalLn);
            }
        }
    }
}
