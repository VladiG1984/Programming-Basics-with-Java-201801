import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        int maxNumber = 0;

        for (int i = 0; i < iterations; i++) {
            int number = scanner.nextInt();

            if (i == 0) {
                maxNumber = number;
            } else if (number > maxNumber) {
                maxNumber = number;
            }
        }
        System.out.println(maxNumber);
    }
}
