import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = scanner.nextInt();
        double oddSum = 0;
        double oddMin = 0;
        double oddMax = 0;
        double evenSum = 0;
        double evenMin = 0;
        double evenMax = 0;

        for (int i = 1; i <= numberCount ; i++) {
            double number = scanner.nextDouble();

            if (i % 2 == 0) {
                evenSum += number;

                if (i == 2) {
                    evenMax = number;
                    evenMin = number;
                } else {
                    if (number > evenMax) {
                        evenMax = number;
                    }
                    if (number < evenMin) {
                        evenMin = number;
                    }
                }
            } else {
                oddSum += number;

                if (i == 1) {
                    oddMax = number;
                    oddMin = number;
                } else {
                    if (number > oddMax) {
                        oddMax = number;
                    }
                    if (number < oddMin) {
                        oddMin = number;
                    }
                }
            }
        }

        System.out.println("OddSum=" + oddSum + ",");
        if (numberCount < 1) {
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        } else {
            System.out.println("OddMin=" + oddMin + ",");
            System.out.println("OddMax=" + oddMax + ",");
        }

        System.out.println("EvenSum=" + evenSum + ",");
        if (numberCount < 2) {
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {
            System.out.println("EvenMin=" + evenMin + ",");
            System.out.println("EvenMax=" + evenMax);
        }
    }
}
