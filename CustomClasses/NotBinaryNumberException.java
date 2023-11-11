public class NotBinaryNumberException extends RuntimeException {

  public NotBinaryNumberException(String errorMessage) {
    super(errorMessage);
  }

  public NotBinaryNumberException() {
    super("This is not a binary number.");
  }
}