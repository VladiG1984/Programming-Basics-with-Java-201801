import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 1;

        while (sum <= n) {
            System.out.println(sum);
            sum = sum * 2 + 1;

        }
    }
}
