import java.util.Scanner;

public class NumberInRange1to100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = scanner.nextInt();

            if (number < 1 || number > 100) {
                System.out.println("Invalid number!");
            } else {
                System.out.println("The number is: " + number);
                break;
            }
        }
    }
}
