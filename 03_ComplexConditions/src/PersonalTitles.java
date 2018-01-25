import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = scanner.nextDouble();
        String gender = scanner.next();

        String title = "";

        if (age >= 16) {
            if (gender.equals("m")) {
                title = "Mr.";
            } else if (gender.equals("f")){
                title = "Ms.";
            }
        } else {
            if (gender.equals("m")) {
                title = "Master";
            } else if (gender.equals("f")){
                title = "Miss";
            }
        }

        System.out.println(title);
    }
}
