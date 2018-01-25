import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        boolean isInRange = number >= 100 && number <= 200 || number == 0;

        if (isInRange == false) {
            System.out.println("invalid");
        }
    }
}
