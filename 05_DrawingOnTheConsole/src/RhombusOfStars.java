import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        String star = "*";
        String space = " ";

        // upper part of rhombus
        for (int i = 1; i <= iterations; i++) {
            for (int j = 1; j <= iterations - i; j++) {
                System.out.print(space);
            }
            System.out.print(star);
            for (int k = 1; k < i; k++){
                System.out.print(space + star);
            }
            System.out.println();
        }

        // lower part of rhombus
        for (int i = iterations - 1; i >= 1; i--) {
            for (int j = 1; j <= iterations - i; j++) {
                System.out.print(space);
            }
            System.out.print(star);
            for (int k = 1; k < i; k++) {
                System.out.print(space + star);
            }
            System.out.println();
        }
    }
}
