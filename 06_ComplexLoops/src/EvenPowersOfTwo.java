import java.util.Scanner;

public class EvenPowersOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 1;

        for (int i = 0; i <= n; i += 2) {
            System.out.println(sum);
            sum = 2 * 2 * sum;
        }
    }
}
