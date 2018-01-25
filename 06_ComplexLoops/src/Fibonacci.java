import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int fibNum1 = 1;
        int fibNum2 = 0;
        int fibNum = 1;

        for (int i = 1; i < n; i++) {
            fibNum = fibNum1 + fibNum2;
            fibNum2 = fibNum1;
            fibNum1 = fibNum;
        }
        System.out.println(fibNum1 + fibNum2);
    }
}
