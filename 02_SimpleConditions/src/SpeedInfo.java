import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = scanner.nextDouble();
        String rate = "";

        if (speed <= 10) {
            rate = "slow";
        } else if (speed <= 50) {
            rate = "average";
        } else if (speed <= 150) {
            rate = "fast";
        } else if (speed <= 1000) {
            rate = "ultra fast";
        } else {
            rate = "extremely fast";
        }

        System.out.println(rate);
    }
}
