package tasks.task04;

import java.util.Locale;
import java.util.Scanner;

public class Task04 {

    static final int MIN_TEMPERATURE = -10;
    static final int MAX_TEMPERATURE = 35;

    public static void main(String[] args) {
        double temperature = getData();
        try {
            validateData(temperature);
        } catch (UnacceptableTemperatureException ex) {
            System.out.println("\n\uD83D\uDD34 Unacceptable temperature \uD83D\uDD34\n" +
                    "\nAn exception has occurred: " + ex);
        }
    }

    public static double getData() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        System.out.print("\n\uD83C\uDF21\uFE0F Enter actual temperature in °C: ");
        return scanner.nextDouble();
    }

    public static void validateData(double temperature) throws UnacceptableTemperatureException {
        if ((temperature >= MIN_TEMPERATURE) && (temperature <= MAX_TEMPERATURE)) {
            System.out.println("\n\uD83D\uDFE2 Acceptable temperature \uD83D\uDFE2");
        } else {
            throw new UnacceptableTemperatureException("\nThe operation of the device is impossible " +
                            "outside the temperature spectrum.");
        }
    }
}
