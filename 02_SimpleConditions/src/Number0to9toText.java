import java.util.Scanner;

public class Number0to9toText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String numberToText = "";

        if (number == 1) {
            numberToText = "one";
        } else if (number ==2){
            numberToText = "two";
        } else if (number == 3) {
            numberToText = "three";
        } else if (number == 4) {
            numberToText = "four";
        } else if (number == 5) {
            numberToText = "five";
        } else if (number == 6) {
            numberToText = "six";
        } else if (number ==7 ) {
            numberToText = "seven";
        } else if (number == 8) {
            numberToText = "eight";
        } else if (number ==9){
            numberToText = "nine";
        } else {
            numberToText = "number too big";
        }

        System.out.println(numberToText);
    }
}
