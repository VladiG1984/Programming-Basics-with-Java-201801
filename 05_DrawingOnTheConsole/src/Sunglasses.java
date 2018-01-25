import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String star = "*";
        String blank = " ";
        String slash = "/";
        String verticalLn = "|";

        //start row
        //first stars
        for (int i = 0; i < 2 * n; i++) {
            System.out.print(star);
        }
        //middle blanks
        for (int i = 0; i < n; i++) {
            System.out.print(blank);
        }
        //end stars
        for (int i = 0; i < 2 * n; i++) {
            System.out.print(star);
        }
        System.out.println();
        //main body
        for (int row = 0; row < n - 2; row++) {
            //first half
            System.out.print(star);
            for (int col = 0; col < 2 * n - 2; col++) {
                System.out.print(slash);
            }
            System.out.print(star);
            // middle
            // dependent on even/ odd rows draw vertical lines in the middle
            if ((n % 2 != 0 && row == (n + 1)/ 2 - 2) || (n % 2 == 0 && row == n / 2 - 2)) {
                for (int i = 0; i < n; i++) {
                    System.out.print(verticalLn);
                }
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.print(blank);
                }
            }
            //second half
            System.out.print(star);
            for (int col = 0; col < 2 * n - 2; col++) {
                System.out.print(slash);
            }
            System.out.println(star);
        }
        //end row
        for (int i = 0; i < 2 * n; i++) {
            System.out.print(star);
        }
        //middle blanks
        for (int i = 0; i < n; i++) {
            System.out.print(blank);
        }
        //end stars
        for (int i = 0; i < 2 * n; i++) {
            System.out.print(star);
        }
        System.out.println();
    }
}
