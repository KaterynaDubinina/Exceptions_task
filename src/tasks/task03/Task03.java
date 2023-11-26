package tasks.task03;

import tasks.task02.InvalidIndexException;

import java.util.Locale;
import java.util.Scanner;

public class Task03 {

    static double accountBalance = 1000.00;

    public static void main(String[] args) {
        try {
            double amount = getData();
            validateData(amount);
        } catch (InsufficientFundsException ex) {
            System.out.println("\n\u274C Decline, not sufficient funds \u274C\n" +
                    "\nAn exception has occurred: " + ex);
        }
    }

    public static double getData() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        System.out.print("\n\uD83D\uDECD\uFE0F Let's proceed to the payment of the product \u2B07\uFE0F\n" +
                "\n\uD83D\uDECD\uFE0F Enter the amount you pay in \uD83D\uDCB2: ");
        return scanner.nextDouble();
    }

    public static void validateData(double amount) throws InsufficientFundsException {
        if (amount >= 0 && amount <= accountBalance) {
            System.out.println("\n\u2705 Successful \u2705");
        } else {
            throw new InsufficientFundsException("\nThere are insufficient funds on the card balance.");
        }
    }
}
