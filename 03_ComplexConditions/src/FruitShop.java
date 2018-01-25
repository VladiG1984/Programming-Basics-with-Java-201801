import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String dayOfWeek = scanner.nextLine().toLowerCase();
        double quantity = scanner.nextDouble();
        double price = 0;

        boolean isWeekday = dayOfWeek.equals("monday") || dayOfWeek.equals("tuesday") || dayOfWeek.equals("wednesday") ||
                            dayOfWeek.equals("thursday") || dayOfWeek.equals("friday");
        boolean isWeekend = dayOfWeek.equals("saturday") || dayOfWeek.equals("sunday");

        if (isWeekday) {
            switch(product) {
                case "banana":
                    price = quantity * 2.50;
                    break;
                case "apple":
                    price = quantity * 1.20;
                    break;
                case "orange":
                    price = quantity * 0.85;
                    break;
                case "grapefruit":
                    price = quantity * 1.45;
                    break;
                case "kiwi":
                    price = quantity * 2.70;
                    break;
                case "pineapple":
                    price = quantity * 5.50;
                    break;
                case "grapes":
                    price = quantity * 3.85;
                    break;
                default:
                    price = 0;
                    break;
            }
            if (price != 0) {
                System.out.printf("%.2f%n", price);
            } else {
                System.out.println("error");
            }
        } else if (isWeekend) {
            switch(product) {
                case "banana":
                    price = quantity * 2.70;
                    break;
                case "apple":
                    price = quantity * 1.25;
                    break;
                case "orange":
                    price = quantity * 0.90;
                    break;
                case "grapefruit":
                    price = quantity * 1.60;
                    break;
                case "kiwi":
                    price = quantity * 3.00;
                    break;
                case "pineapple":
                    price = quantity * 5.60;
                    break;
                case "grapes":
                    price = quantity * 4.20;
                    break;
                default:
                    price = 0;
                    break;
            }
            if (price != 0) {
                System.out.printf("%.2f%n", price);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
