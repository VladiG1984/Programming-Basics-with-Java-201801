import java.util.Scanner;

public class HelloName {
    static void printHelloName(String name) {
        System.out.printf("Hello, %s!", name);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        printHelloName(name);
    }
}
