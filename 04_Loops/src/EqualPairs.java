import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPairs = scanner.nextInt();
        int maxSum = 0;
        int minSum = 0;
        int currentSum = 0;
        //int maxDiff = 0;

        for (int i = 1; i <= numberOfPairs ; i++) {
            for (int j = 1; j <= 2 ; j++) {
                int number = scanner.nextInt();
                currentSum += number;
            }
            if (i == 1) {
                maxSum = currentSum;
                minSum = currentSum;
            } else {
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
                if (minSum > currentSum) {
                    minSum = currentSum;
                }
            }
            currentSum = 0;
        }

        if (maxSum - minSum != 0) {
            System.out.println("No, maxdiff=" + (maxSum - minSum));
        } else {
            System.out.println("Yes, value=" + maxSum);
        }
    }
}
