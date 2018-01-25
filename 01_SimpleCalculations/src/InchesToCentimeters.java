import java.util.Scanner;

public class InchesToCentimeters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Inches = ");
        Double inches = scanner.nextDouble();
        Double centimeters = inches * 2.54;
        System.out.print(" Cenimeters = ");
        System.out.println(centimeters);


    }

}
