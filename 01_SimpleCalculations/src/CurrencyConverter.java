import java.util.Scanner;
import java.text.DecimalFormat;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputAmount = Double.parseDouble(scanner.nextLine());
        String inputCurrency = scanner.nextLine();
        String outputCurrency = scanner.nextLine();
        double outputAmount = 0.0;

        DecimalFormat df = new DecimalFormat("#.##");
        //inputCurrency = "USD";
        //outputCurrency = "BGN";

        if (inputCurrency.equals("USD")) {
            switch(outputCurrency) {
                case "BGN": outputAmount = inputAmount * 1.79549; break;
                case "EUR": outputAmount = inputAmount * 1.79549 / 1.95583; break;
                case "GBP": outputAmount = inputAmount * 1.79549 / 2.53405; break;
                default: outputAmount = 99999; break;
            }
        }

        else if (inputCurrency.equals("EUR")) {
            switch(outputCurrency) {
                case "BGN": outputAmount = inputAmount * 1.95583; break;
                case "USD": outputAmount = inputAmount * 1.95583 / 1.79549; break;
                case "GBP": outputAmount = inputAmount * 1.95583 / 2.53405; break;
                default: outputAmount = 99999; break;
            }
        }

        else if (inputCurrency.equals("GBP")) {
            switch(outputCurrency) {
                case "BGN": outputAmount = inputAmount * 2.53405; break;
                case "EUR": outputAmount = inputAmount * 2.53405 / 1.95583; break;
                case "USD": outputAmount = inputAmount * 2.53405 / 1.79549; break;
                default: outputAmount = 99999; break;
            }
        }

        else if (inputCurrency.equals("BGN")) {
            switch(outputCurrency) {
                case "EUR": outputAmount = inputAmount / 1.95583; break;
                case "USD": outputAmount = inputAmount / 1.79549; break;
                case "GBP": outputAmount = inputAmount / 2.53405; break;
                default: outputAmount = 99999; break;
            }
        }

        System.out.println(df.format(outputAmount) + " "  + outputCurrency);
        //System.out.printf(outputAmount + " %s", outputCurrency);
    }
}
