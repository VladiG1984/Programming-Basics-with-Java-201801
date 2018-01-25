import java.util.Scanner;
import java.text.DecimalFormat;

public class USDtoBGN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double USD = Double.parseDouble(scanner.nextLine());
        double BGN = 1.79549 * USD;
        //String output = BGN + " BGN";

        // System.out.printf("%.2f%n BGN", BGN);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(BGN) + " BGN");
    }
}
