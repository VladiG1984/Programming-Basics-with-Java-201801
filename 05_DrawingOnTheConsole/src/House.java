import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String star = "*";
        String dash = "-";
        String verticalLn = "|";
        int roofRows = 0;

        if (n % 2 == 0 ) {
            roofRows = n / 2;
        } else {
            roofRows = n / 2 + 1;
        }
        //house roof
        for (int row = 0; row < roofRows; row++) {
            if (n % 2 == 0) {
                //start dashes
                for (int dashes = 0; dashes < n / 2 - 1 - row; dashes++) {
                    System.out.print(dash);
                }
                // stars
                for (int i = 0; i < 2 * (row + 1); i++) {
                    System.out.print(star);
                }
                //end dashes
                for (int dashes = 0; dashes < n / 2 - 1 - row; dashes++) {
                    System.out.print(dash);
                }
                System.out.println();
            } else {
                //start dashes
                for (int dashes = 0; dashes < n / 2 - row; dashes++) {
                    System.out.print(dash);
                }
                // stars
                for (int i = 0; i < 2 * row + 1; i++) {
                    System.out.print(star);
                }
                //end dashes
                for (int dashes = 0; dashes < n / 2 - row; dashes++) {
                    System.out.print(dash);
                }
                System.out.println();
            }
        }
        // house floors
        for (int row = 0; row < n / 2; row++) {
            //start vertical line
            System.out.print(verticalLn);
            for (int col = 0; col < n - 2; col++) {
                System.out.print(star);
            }
            //end vertical line
            System.out.print(verticalLn);
            System.out.println();
        }
    }
}
