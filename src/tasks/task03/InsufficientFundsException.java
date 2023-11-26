package tasks.task03;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException (String message) {
        super(message);
    }
}
