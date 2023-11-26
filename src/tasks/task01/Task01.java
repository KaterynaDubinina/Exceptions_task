package tasks.task01;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        String price = getData();
        getOutput(validateData(price));
    }

    public static String getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\uD83D\uDFE2 Input int number: ");
        return scanner.nextLine();
    }

    public static String validateData(String price) {
        try {
            Integer.parseInt(price);
            return price;
        } catch (NumberFormatException nfe) {
            return "\n\uD83D\uDD34 Not an int number \uD83D\uDD34";
        }
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}