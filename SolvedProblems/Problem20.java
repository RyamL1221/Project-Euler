import java.math.BigInteger;

class Problem20 {

  public static void main(String[] args) {
    BigInteger oneHundred = BigInteger.TEN.multiply(BigInteger.TEN);
    oneHundred = factorial(oneHundred);
    String numString = oneHundred + "";
    int sum = 0;
    for(int i = 0; i < numString.length(); i++)
      sum += Integer.parseInt(numString.substring(i, i +1 ));
    System.out.println(sum);
    
      
  }

  public static BigInteger factorial(BigInteger n) { 
    if(n.equals(BigInteger.ONE)) //base case
      return(BigInteger.ONE);
    else // general case
      return(n.multiply(factorial(n.subtract(BigInteger.ONE)))); //recursive
  }
}