package tasks.task02;

import java.util.Scanner;

public class Task02 {

        static double[] productPrice = {11.99, 12.99, 13.99, 14.99, 15.99};

        public static void main(String[] args) {
            int index = getData();
            try {
                validateData(index);
            } catch (InvalidIndexException ex) {
                System.out.println("\n\u2757 Index " + index + " is wrong \u2757\n" +
                        "\nAn exception has occurred: " + ex);
            }
        }

        public static int getData() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nFor 5 days, we tracked \uD83D\uDCB2 of the \uD83D\uDED2" +
                    "\nTo find out \uD83D\uDCB2 on one of these days \u2B07\uFE0F" +
                    "\n" +
                    "\n\uD83D\uDCB5 Input the index of the day (1-5): ");
            return scanner.nextInt();
        }

        public static void validateData(int index) throws InvalidIndexException {
            int arrayIndex = index - 1;
            if (arrayIndex >= 0 && arrayIndex < productPrice.length) {
                System.out.println("Product price in the day " + index
                        + ": \uD83D\uDCB2" + productPrice[arrayIndex]);
            } else {
                throw new InvalidIndexException("\nIncorrect day index entered.");
            }
        }
}
