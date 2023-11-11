import java.math.BigInteger;

public class Problem48 { // answer: 9110846700

  public static void main(String[] args) {
    BigInteger num = BigInteger.ZERO;
    BigInteger base = BigInteger.ONE;
    for(int i = 1; i <= 1000; i++) {
      num = num.add(base.pow(Integer.parseInt(base.toString())));
      base = base.add(BigInteger.ONE);
    }
    String numString = num.toString();
    System.out.println(numString.substring(numString.length() - 10));
  }
}