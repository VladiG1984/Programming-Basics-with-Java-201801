import java.util.Scanner;

public class NthDigit {
    static void findNthDigit(int number, int index) {

        for (int i = 1; i < index; i++) {
            number = number / 10;
        }
        System.out.println(number % 10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int index = Integer.parseInt(scanner.nextLine());

        findNthDigit(number, index);
    }
}
