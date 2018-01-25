import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        String inputMetric = scanner.next().toLowerCase();
        String outputMetric = scanner.next().toLowerCase();
        double convertedValue;

        int mToMm = 1000;
        int mToCm = 100;
        double mToMile = 0.000621371192;
        double mToInch = 39.3700787;
        double mToKm = 0.001;
        double mToFt = 3.2808399;
        double mToYard = 1.0936133;

        switch (inputMetric) {
            case "mm":
                switch (outputMetric) {
                    case "mm":
                        convertedValue = value;
                        break;
                    case "cm":
                        convertedValue = value * mToCm / mToMm;
                        break;
                    case "m":
                        convertedValue = value / mToMm;
                        break;
                    case "km":
                        convertedValue = value * mToKm / mToMm;
                        break;
                    case "in":
                        convertedValue = value * mToInch / mToMm;
                        break;
                    case "ft":
                        convertedValue = value * mToFt / mToMm;
                        break;
                    case "yd":
                        convertedValue = value * mToYard / mToMm;
                        break;
                    case "mi":
                        convertedValue = value * mToMile / mToMm;
                        break;
                    default:
                        convertedValue = -999999;
                        break;
                }
                break;
            case "cm":
                switch (outputMetric) {
                    case "cm":
                        convertedValue = value;
                        break;
                    case "mm":
                        convertedValue = value * mToMm / mToCm;
                        break;
                    case "m":
                        convertedValue = value / mToCm;
                        break;
                    case "km":
                        convertedValue = value * mToKm / mToCm;
                        break;
                    case "in":
                        convertedValue = value * mToInch / mToCm;
                        break;
                    case "ft":
                        convertedValue = value * mToFt / mToCm;
                        break;
                    case "yd":
                        convertedValue = value * mToYard / mToCm;
                        break;
                    case "mi":
                        convertedValue = value * mToMile / mToCm;
                        break;
                    default:
                        convertedValue = -999999;
                        break;
                }
                break;
            case "m":
                switch (outputMetric) {
                    case "m":
                        convertedValue = value;
                        break;
                    case "mm":
                        convertedValue = value * mToMm;
                        break;
                    case "cm":
                        convertedValue = value * mToCm;
                        break;
                    case "km":
                        convertedValue = value * mToKm;
                        break;
                    case "in":
                        convertedValue = value * mToInch;
                        break;
                    case "ft":
                        convertedValue = value * mToFt;
                        break;
                    case "yd":
                        convertedValue = value * mToYard;
                        break;
                    case "mi":
                        convertedValue = value * mToMile;
                        break;
                    default:
                        convertedValue = -999999;
                        break;
                }
                break;
            case "km":
                switch (outputMetric) {
                    case "km":
                        convertedValue = value;
                        break;
                    case "mm":
                        convertedValue = value * mToMm / mToKm;
                        break;
                    case "cm":
                        convertedValue = value * mToCm / mToKm;
                        break;
                    case "m":
                        convertedValue = value / mToKm;
                        break;
                    case "in":
                        convertedValue = value * mToInch / mToKm;
                        break;
                    case "ft":
                        convertedValue = value * mToFt / mToKm;
                        break;
                    case "yd":
                        convertedValue = value * mToYard / mToKm;
                        break;
                    case "mi":
                        convertedValue = value * mToMile / mToKm;
                        break;
                    default:
                        convertedValue = -999999;
                        break;
                }
                break;
            case "in":
                switch (outputMetric) {
                    case "in":
                        convertedValue = value;
                        break;
                    case "mm":
                        convertedValue = value * mToMm / mToInch;
                        break;
                    case "cm":
                        convertedValue = value * mToCm / mToInch;
                        break;
                    case "m":
                        convertedValue = value / mToInch;
                        break;
                    case "km":
                        convertedValue = value * mToKm / mToInch;
                        break;
                    case "ft":
                        convertedValue = value * mToFt / mToInch;
                        break;
                    case "yd":
                        convertedValue = value * mToYard / mToInch;
                        break;
                    case "mi":
                        convertedValue = value * mToMile / mToInch;
                        break;
                    default:
                        convertedValue = -999999;
                        break;
                }
                break;
            case "ft":
                switch (outputMetric) {
                    case "ft":
                        convertedValue = value;
                        break;
                    case "mm":
                        convertedValue = value * mToMm / mToFt;
                        break;
                    case "cm":
                        convertedValue = value * mToCm / mToFt;
                        break;
                    case "m":
                        convertedValue = value / mToFt;
                        break;
                    case "km":
                        convertedValue = value * mToKm / mToFt;
                        break;
                    case "in":
                        convertedValue = value * mToInch / mToFt;
                        break;
                    case "yd":
                        convertedValue = value * mToYard / mToFt;
                        break;
                    case "mi":
                        convertedValue = value * mToMile / mToFt;
                        break;
                    default:
                        convertedValue = -999999;
                        break;
                }
                break;
            case "yd":
                switch (outputMetric) {
                    case "yd":
                        convertedValue = value;
                        break;
                    case "mm":
                        convertedValue = value * mToMm / mToYard;
                        break;
                    case "cm":
                        convertedValue = value * mToCm / mToYard;
                        break;
                    case "m":
                        convertedValue = value / mToYard;
                        break;
                    case "km":
                        convertedValue = value * mToKm / mToYard;
                        break;
                    case "in":
                        convertedValue = value * mToInch / mToYard;
                        break;
                    case "ft":
                        convertedValue = value * mToFt / mToYard;
                        break;
                    case "mi":
                        convertedValue = value * mToMile / mToYard;
                        break;
                    default:
                        convertedValue = -999999;
                        break;
                }
                break;
            case "mi":
                switch (outputMetric) {
                    case "mi":
                        convertedValue = value;
                        break;
                    case "mm":
                        convertedValue = value * mToMm / mToMile;
                        break;
                    case "cm":
                        convertedValue = value * mToCm / mToMile;
                        break;
                    case "m":
                        convertedValue = value / mToMile;
                        break;
                    case "km":
                        convertedValue = value * mToKm / mToMile;
                        break;
                    case "in":
                        convertedValue = value * mToInch / mToMile;
                        break;
                    case "ft":
                        convertedValue = value * mToFt / mToMile;
                        break;
                    case "yd":
                        convertedValue = value * mToYard / mToMile;
                        break;
                    default:
                        convertedValue = -999999;
                        break;
                }
                break;
            default:
                convertedValue = -9999991;
                break;
        }
        System.out.println(convertedValue);
    }
}
