import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int numberBig;
        int numberSmall;
        int GCD = 0;

        if (number2 > number1) {
            numberBig = number2;
            numberSmall = number1;
        } else {
            numberBig = number1;
            numberSmall = number2;
        }

        while (numberSmall != 0) {
            GCD = numberSmall;
            numberSmall = numberBig % numberSmall;
        }
        System.out.println(GCD);
    }
}
