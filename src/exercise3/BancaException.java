package exercise3;

public class BancaException extends Exception {
    public BancaException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
