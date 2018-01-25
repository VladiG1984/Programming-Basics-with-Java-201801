import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        int minNumber = 0;

        for (int i = 0; i < iterations; i++) {
            int number = scanner.nextInt();

            if (i == 0) {
                minNumber = number;
            } else if (number < minNumber) {
                minNumber = number;
            }
        }
        System.out.println(minNumber);
    }
}
