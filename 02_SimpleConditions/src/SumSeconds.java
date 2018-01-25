import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = 0;
        int totalSeconds = 0;
        int count = 0;
        int mm = 0;
        int ss = 0;

        while (count < 3) {
            seconds = scanner.nextInt();
            totalSeconds+= seconds;
            count++;
        }

        mm = totalSeconds / 60;
        ss = totalSeconds % 60;

        if (ss < 10) {
            System.out.println(mm + ":0" + ss);
        } else {
            System.out.println(mm + ":" + ss);
        }
    }
}
