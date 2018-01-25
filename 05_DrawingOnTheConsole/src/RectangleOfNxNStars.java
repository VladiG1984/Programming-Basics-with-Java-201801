import java.util.Scanner;

public class RectangleOfNxNStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        char star = '*';

        for (int i = 0; i < iterations; i++) {
            for (int j = 0; j < iterations; j++) {
                System.out.print(star);
            }
            System.out.println();
        }

    }
}
