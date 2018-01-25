import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = scanner.nextDouble();
        double price = 0;

        if (city.equals("Sofia")) {
            switch(product) {
                case "coffee":
                    price = quantity * 0.5;
                    break;
                case "water":
                    price = quantity * 0.8;
                    break;
                case "beer":
                    price = quantity * 1.20;
                    break;
                case "sweets":
                    price = quantity * 1.45;
                    break;
                case "peanuts":
                    price = quantity * 1.60;
                    break;
                default:
                    price = 0;
                    break;
            }
        } else if (city.equals("Plovdiv")) {
            switch(product) {
                case "coffee":
                    price = quantity * 0.4;
                    break;
                case "water":
                    price = quantity * 0.7;
                    break;
                case "beer":
                    price = quantity * 1.15;
                    break;
                case "sweets":
                    price = quantity * 1.30;
                    break;
                case "peanuts":
                    price = quantity * 1.50;
                    break;
                default:
                    price = 0;
                    break;
            }
        } else if (city.equals("Varna")) {
            switch(product) {
                case "coffee":
                    price = quantity * 0.45;
                    break;
                case "water":
                    price = quantity * 0.7;
                    break;
                case "beer":
                    price = quantity * 1.10;
                    break;
                case "sweets":
                    price = quantity * 1.35;
                    break;
                case "peanuts":
                    price = quantity * 1.55;
                    break;
                default:
                    price = 0;
                    break;
            }
        }

        System.out.println(price);
    }
}
