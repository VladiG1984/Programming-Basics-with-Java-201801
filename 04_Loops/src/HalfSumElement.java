import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = scanner.nextInt();
        int maxNumber = 0;
        int sum = 0;

        for (int i = 1; i <= numberCount ; i++) {
            int number = scanner.nextInt();

            sum += number;

            if (i == 1) {
                maxNumber = number;
            } else if (number > maxNumber){
                maxNumber = number;
            }
        }

        if (maxNumber == (double)sum / 2) {
            System.out.printf("Yes%nSum = " + maxNumber);
        } else {
            System.out.printf("No%nDiff = " + (Math.abs(sum - 2 * maxNumber)));
        }

    }
}
