import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        int sumNumbers = 0;

        for (int i = 1; i <= iterations; i++) {
            int number = scanner.nextInt();
            sumNumbers += number;
        }
        System.out.println(sumNumbers);
    }
}
