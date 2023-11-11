import java.math.BigInteger;

class Problem16B {

  public static void main(String[] args) {

    BigInteger product = new BigInteger("2");
    product = product.pow(1000);
    BigInteger sum = BigInteger.ZERO;

    while(product.compareTo(BigInteger.ZERO) != 0) {
      sum = sum.add(product.mod(BigInteger.TEN));
      product = product.divide(BigInteger.TEN);
    } 
    
    System.out.print(sum);
  } //solved by byan. answer: 1366
  
}