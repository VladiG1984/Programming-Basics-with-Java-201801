import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] ars) {
        Scanner scanner = new Scanner(System.in);
        //double score = Double.parseDouble(scanner.nextLine());
        double score = scanner.nextDouble();

        if (score >= 5.5 && score <= 6) {
            System.out.println("Excellent!");
        }

    }
}
