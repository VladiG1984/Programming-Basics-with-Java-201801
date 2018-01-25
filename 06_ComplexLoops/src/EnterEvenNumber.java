import java.util.Scanner;

public class EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter even number: ");
            int n = scanner.nextInt();
            if (n % 2 == 0) {
                System.out.printf("Even number entered: %d.", n);
                break;
            } else {
                System.out.println("The number is not even.");
            }
        }
    }
}
