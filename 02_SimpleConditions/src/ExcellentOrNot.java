import java.util.Scanner;

public class ExcellentOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double score = scanner.nextDouble();

        if (score >= 5.5) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Not excellent.");
        }
    }
}
