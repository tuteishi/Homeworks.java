package homework8Exceptions;

public class NegativeNumberException extends Exception{
    public NegativeNumberException() {
    }

    public NegativeNumberException(String message) {
        super(message);
    }

    public NegativeNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeNumberException(Throwable cause) {
        super(cause);
    }

    public NegativeNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
