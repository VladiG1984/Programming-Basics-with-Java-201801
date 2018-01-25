import java.util.Scanner;

public class NumbersToWords {
    static String readOnes(int n) {
        int ones = Math.abs(n % 10);
        String onesLetter = "";
        //System.out.println(ones);
        switch(ones) {
            case 0:
                onesLetter = "";
                break;
            case 1:
                onesLetter = "one";
                break;
            case 2:
                onesLetter = "two";
                break;
            case 3:
                onesLetter = "three";
                break;
            case 4:
                onesLetter = "four";
                break;
            case 5:
                onesLetter = "five";
                break;
            case 6:
                onesLetter = "six";
                break;
            case 7:
                onesLetter = "seven";
                break;
            case 8:
                onesLetter = "eight";
                break;
            case 9:
                onesLetter = "nine";
                break;
        }
        //System.out.println(onesLetter);
        return onesLetter;
    }

    static String readDecimals(int n) {
        int decimals = Math.abs((n / 10) % 10);
        int ones = n % 10;
        String decimalsLetter = "";
        //System.out.println(decimals);
        switch(decimals) {
            case 0:
                decimalsLetter = "";
                break;
            case 1:
                switch(ones) {
                    case 0:
                        decimalsLetter = "ten";
                        break;
                    case 1:
                        decimalsLetter = "eleven";
                        break;
                    case 2: decimalsLetter = "twelve";
                        break;
                    case 3: decimalsLetter = "thirteen";
                        break;
                    case 4: decimalsLetter = "fourteen";
                        break;
                    case 5: decimalsLetter = "fifteen";
                        break;
                    case 6: decimalsLetter = "sixteen";
                        break;
                    case 7: decimalsLetter = "seventeen";
                        break;
                    case 8: decimalsLetter = "eighteen";
                        break;
                    case 9: decimalsLetter = "nineteen";
                        break;
                    }
                break;
            case 2:
                decimalsLetter = "twenty";
                break;
            case 3:
                decimalsLetter = "thirty";
                break;
            case 4:
                decimalsLetter = "forty";
                break;
            case 5:
                decimalsLetter = "fifty";
                break;
            case 6:
                decimalsLetter = "sixty";
                break;
            case 7:
                decimalsLetter = "seventy";
                break;
            case 8:
                decimalsLetter = "eighty";
                break;
            case 9:
                decimalsLetter = "ninety";
                break;
        }
        //System.out.println(decimalsLetter);
        return decimalsLetter;
    }

    static String readHundreds(int n) {
        int hundreds = Math.abs(((n / 10) / 10));
        String hundredsLetter = "";

        switch(hundreds) {
            case 1:
                hundredsLetter = "one hundred";
                break;
            case 2:
                hundredsLetter = "two hundred";
                break;
            case 3:
                hundredsLetter = "three hundred";
                break;
            case 4:
                hundredsLetter = "four hundred";
                break;
            case 5:
                hundredsLetter = "five hundred";
                break;
            case 6:
                hundredsLetter = "six hundred";
                break;
            case 7:
                hundredsLetter = "seven hundred";
                break;
            case 8:
                hundredsLetter = "eight hundred";
                break;
            case 9:
                hundredsLetter = "nine hundred";
                break;
        }
        if (n < 0) {
            return "minus " + hundredsLetter;
        } else {
            return hundredsLetter;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        if (n > 999) {
            System.out.println("too large");
        } else if (n < -999) {
            System.out.println("too small");
        } else if (Math.abs((n / 10) / 10) == 0) {
            System.out.println("");
        } else {
                if (Math.abs(n % 10) != 0) {
                    if (Math.abs((n / 10) % 10) == 1) {
                        System.out.println(readHundreds(n) + " and " + readDecimals(n));
                    } else if (Math.abs((n / 10) % 10) > 1) {
                        System.out.println(readHundreds(n) + " and " + readDecimals(n) + "-" + readOnes(n));
                    }
                } else {
                    if (Math.abs((n / 10) % 10) != 0) {
                        System.out.println(readHundreds(n) + " and " + readDecimals(n));
                    }
                    else {
                        System.out.println(readHundreds(n));
                    }
                }
            }
    }
}
