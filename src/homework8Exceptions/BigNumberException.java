package homework8Exceptions;

public class BigNumberException extends Exception{
    public BigNumberException() {
    }

    public BigNumberException(String message) {
        super(message);
    }

    public BigNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public BigNumberException(Throwable cause) {
        super(cause);
    }

    public BigNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
