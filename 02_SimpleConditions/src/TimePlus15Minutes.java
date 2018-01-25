import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        if (minutes >= 45) {
            if (hours != 23) {
                hours = hours + 1;
            } else {
                hours = 0;
            }
            minutes = minutes + 15 - 60;
        } else {
            hours = hours;
            minutes = minutes + 15;
        }

        if (minutes >= 10) {
            System.out.printf("%d:%d", hours, minutes);
        } else {
            System.out.printf("%d:0%d", hours, minutes);
        }
    }
}
