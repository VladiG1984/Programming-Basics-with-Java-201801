import java.util.Scanner;

public class TradeCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = scanner.nextDouble();
        double commission = 0;

        if (sales >= 0 && sales <= 500) {
            switch(city) {
                case "Sofia":
                    commission = sales * 0.05;
                    break;
                case "Varna":
                    commission = sales * 0.045;
                    break;
                case "Plovdiv":
                    commission = sales * 0.055;
                    break;
            }
        } else if (sales <=  1000) {
            switch(city) {
                case "Sofia":
                    commission = sales * 0.07;
                    break;
                case "Varna":
                    commission = sales * 0.075;
                    break;
                case "Plovdiv":
                    commission = sales * 0.08;
                    break;
            }
        } else if (sales <= 10000) {
            switch(city) {
                case "Sofia":
                    commission = sales * 0.08;
                    break;
                case "Varna":
                    commission = sales * 0.10;
                    break;
                case "Plovdiv":
                    commission = sales * 0.12;
                    break;
            }
        } else if (sales > 10000) {
            switch(city) {
                case "Sofia":
                    commission = sales * 0.12;
                    break;
                case "Varna":
                    commission = sales * 0.13;
                    break;
                case "Plovdiv":
                    commission = sales * 0.145;
                    break;
            }
        }

        if (sales < 0 || (!city.equals("Sofia") && !city.equals("Varna") && !city.equals("Plovdiv"))) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f%n", commission);
        }
    }
}
