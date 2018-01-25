import java.util.Scanner;

public class MinMethod {
    static int getMin(int number1, int number2) {
        if (number1 < number2) {
            return number1;
        } else {
            return number2;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int minNumber = getMin(getMin(number1, number2), number3);

        System.out.println(minNumber);
    }
}
