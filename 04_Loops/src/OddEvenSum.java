import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= iterations; i++) {
            int number = scanner.nextInt();

            if (i % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }
        if (sumEven == sumOdd) {
            System.out.printf("Yes%nSum = " + sumEven);
        } else {
            System.out.printf("No%nDiff = " + (Math.abs(sumEven - sumOdd)));
        }
    }
}
