import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sumDigits = 0;

        do {
            sumDigits += n % 10;
            n = n / 10;
        } while (n > 0);
        System.out.println(sumDigits);

    }
}
