import java.util.Scanner;

public class IntegerToBase {
    static String integerToBase(int number, int base) {
        StringBuilder result = new StringBuilder();
        //int remainder;

        do {
            int remainder = number % base;
            number = number / base;
            //System.out.println(number);
            result.insert(0, remainder); //same as result = remainder + result;

        } while(number != 0);
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int base = Integer.parseInt(scanner.nextLine());

        System.out.println(integerToBase(number, base));
    }
}
