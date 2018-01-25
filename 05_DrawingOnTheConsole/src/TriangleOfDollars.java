import java.util.Scanner;

public class TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        char symbol = '$';

        for (int i = 0; i < iterations; i++) {
            System.out.print(symbol);
            for (int j = 0; j < i; j++) {
                System.out.print(" " + symbol);
            }
            System.out.println();
        }
    }
}
