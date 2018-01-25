import java.util.Scanner;

public class Number0to100toText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int digit = number % 10;
        String textNumber;
        String textDigit = null;
        String textDecimal = null;

        switch(digit) {
            case 0:
                textDigit = "zero";
                break;
            case 1:
                textDigit = "one";
                break;
            case 2:
                textDigit = "two";
                break;
            case 3:
                textDigit = "three";
                break;
            case 4:
                textDigit = "four";
                break;
            case 5:
                textDigit = "five";
                break;
            case 6:
                textDigit = "six";
                break;
            case 7:
                textDigit = "seven";
                break;
            case 8:
                textDigit = "eight";
                break;
            case 9:
                textDigit = "nine";
                break;
        }

        switch(number) {
            case 10:
                textDigit = "ten";
                break;
            case 11:
                textDigit = "eleven";
                break;
            case 12:
                textDigit = "twelve";
                break;
            case 13:
                textDigit = "thirteen";
                break;
            case 14:
                textDigit = "fourteen";
                break;
            case 15:
                textDigit = "fifteen";
                break;
            case 16:
                textDigit = "sixteen";
                break;
            case 17:
                textDigit = "seventeen";
                break;
            case 18:
                textDigit = "eighteen";
                break;
            case 19:
                textDigit = "nineteen";
                break;
        }

        if (number >= 20 && number < 30) {
            textDecimal = "twenty";
        } else if (number < 40) {
            textDecimal = "thirty";
        } else if (number < 50) {
            textDecimal = "forty";
        } else if (number < 60) {
            textDecimal = "fifty";
        } else if (number < 70) {
            textDecimal = "sixty";
        } else if (number < 80) {
            textDecimal = "seventy";
        } else if (number < 90) {
            textDecimal = "eighty";
        } else if (number < 100) {
            textDecimal = "ninety";
        } else if (number == 100) {
            textDecimal = "one hundred";
        }


        if (number < 20) {
            textNumber = textDigit;
        } else if (number <= 100){
            if (digit != 0) {
                textNumber = textDecimal + " " + textDigit;
            } else {
                textNumber = textDecimal;
            }
        } else {
            textNumber = null;
        }

        System.out.println(textNumber);

    }
}
