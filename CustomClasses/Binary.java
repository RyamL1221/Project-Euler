import java.math.*;

public class Binary {

  private BigInteger binaryValue;
  private BigInteger octalValue;
  private int decimalValue;
  private String hexValue;

  public Binary(int num) {
    binaryValue = CustomMath.convertDecimalToBinary(num);
    decimalValue = num;                                           
  }

  public Binary(String num) {
    for(int i = 0; i < num.length(); i++) {
      if(num.substring(i, i + 1).equals("0") || num.substring(i, i + 1).equals("1"))
        throw new NotBinaryNumberException("This is not a binary number.");
    }
    binaryValue = new BigInteger(num);
  }

  public int getDecimalValue() {
    return decimalValue;
  }

  public BigInteger getBinaryValue() {
    return binaryValue;
  }

  public static BigInteger convertDecimalToBinary(int num) {
    if(num == 1) 
      return BigInteger.ONE;
    BigInteger binNum = BigInteger.ZERO;
    int i = 0;
    while(num > 0) {
      while(Math.pow(2, i) < num)
        i++;
      if(num == Math.pow(2, i))
        return binNum.add(new BigDecimal(Math.pow(10, i)).toBigInteger());
      else {
        binNum = binNum.add(new BigDecimal(Math.pow(10, i - 1)).toBigInteger());
        num -= Math.pow(2, i - 1);
        i = 0;
      }
    }
    return binNum;
  }

  
}