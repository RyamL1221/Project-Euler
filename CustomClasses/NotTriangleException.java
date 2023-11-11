public class NotTriangleException extends RuntimeException {

  public NotTriangleException(String error) {
    super(error);
  }

  public NotTriangleException() {
    super("These dimensions provided are not a triangle.");
  }
}