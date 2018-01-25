import java.util.Scanner;

public class NumberTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n; row++) {
            for (int col = row; col <= n; col++) {
                System.out.print(col + " ");
                if (col == n) {
                    for (int i = n - 1; i > n - row; i--) {
                        System.out.print(i + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
