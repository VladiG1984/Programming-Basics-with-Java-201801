import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String star = "*";
        String underscore = "-"; //not underscore but dash

        //upper half
        for (int row = 0; row < (int) Math.ceil(n / 2f); row++) {
            //beginning  underscores
            for (int underscores = 0; underscores < (int) Math.ceil(n / 2f) - 1 - row; underscores++) {
                System.out.print(underscore);
            }
            //beginning stars
            System.out.print(star);
            //middle underscores dependent on odd/ even n
            if (n % 2 == 0) {
                for (int underscores = 0; underscores < 2 * row; underscores++) {
                    System.out.print(underscore);
                }
            } else {
                for (int underscores = 0; underscores < 2 * row - 1; underscores++) {
                    System.out.print(underscore);
                }
            }
            //ending stars (except when first row of odd n)
            if ((n % 2 != 0 && row !=0) || n % 2 == 0) {
                System.out.print(star);
            }
            //ending  underscores
            for (int underscores = 0; underscores < (int) Math.ceil(n / 2f) - 1 - row; underscores++) {
                System.out.print(underscore);
            }
            System.out.println();
        }
        //lower part
        for (int row = 0; row < (int) Math.ceil(n / 2f) - 1; row++) {
            //beginning  underscores
            for (int underscores = 0; underscores < row + 1; underscores++) {
                System.out.print(underscore);
            }
            //beginning stars
            System.out.print(star);
            //middle underscores dependent on odd/ even n
            for (int underscores = 0; underscores < n - 4 - 2 * row; underscores++) {
                System.out.print(underscore);
            }
            //ending stars (except when first row of odd n)
            if ((n % 2 != 0 && row != (int) Math.ceil(n / 2f) - 2) || n % 2 == 0) {
                System.out.print(star);
            }
            //ending  underscores
            for (int underscores = 0; underscores < row + 1; underscores++) {
                System.out.print(underscore);
            }
            System.out.println();
        }

    }
}
