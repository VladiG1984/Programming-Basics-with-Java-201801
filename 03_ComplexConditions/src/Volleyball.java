import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yearType = scanner.nextLine();
        int numberHolidays = scanner.nextInt();
        int numberWeekendsOutOfTown = scanner.nextInt();
        int numberWeekendsInYear = 48;

        double games = (2 * (double)numberHolidays) / 3 + numberWeekendsOutOfTown +
                        3 * (double)(numberWeekendsInYear - numberWeekendsOutOfTown) / 4;

        if (yearType.equals("leap")) {
            games = games * 1.15;
        }

        System.out.printf("%.0f%n", Math.floor(games));
        //System.out.println(games);
    }
}
