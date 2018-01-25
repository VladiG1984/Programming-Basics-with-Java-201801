import java.util.Scanner;

public class StringRepeater {
    static void repeatString(String str, int repeat) {
        String result = "";
        for (int i = 0; i < repeat; i++) {
            result += str;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int repeat = Integer.parseInt(scanner.nextLine());

        repeatString(str, repeat);
    }
}
