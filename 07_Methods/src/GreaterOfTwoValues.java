import java.util.Scanner;

public class GreaterOfTwoValues {
    static void compareTwoValues(int value1, int value2) {
        if (value1 > value2) {
            System.out.println(value1);
        } else {
            System.out.println(value2);
        }
    }

    static void compareTwoValues(char value1, char value2) {
        if (value1 > value2) {
            System.out.println(value1);
        } else {
            System.out.println(value2);
        }
    }

    static void compareTwoValues(String value1, String value2) {
        if (value1.compareTo(value2) > 0) {
            System.out.println(value1);
        } else {
            System.out.println(value2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        if (type.equals("int")) {
            int value1 = Integer.parseInt(scanner.nextLine());
            int value2 = Integer.parseInt(scanner.nextLine());
            compareTwoValues(value1, value2);
        } else if (type.equals("char")) {
            String value1 = scanner.nextLine();
            String value2 = scanner.nextLine();
            compareTwoValues(value1, value2);
        } else {
            String value1 = scanner.nextLine();
            String value2 = scanner.nextLine();
            compareTwoValues(value1, value2);
        }
    }
}
