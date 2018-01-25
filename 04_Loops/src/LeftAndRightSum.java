import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < iterations; i++) {
            int number = scanner.nextInt();
            sum1 += number;
        }

        for (int i = 0; i < iterations; i++) {
            int number = scanner.nextInt();
            sum2 += number;
        }

        if (sum1 == sum2) {
            System.out.println("Yes, sum = " + sum2);
        } else {
            System.out.println("No, diff = " + (Math.abs(sum1 - sum2)));
        }
    }
}
