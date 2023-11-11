import java.math.*;
class Problem25B { // answer: 4782

  public static void main(String[] args) {
    int count = 2;
    BigInteger f1 = BigInteger.ONE;
    BigInteger f2 = BigInteger.ONE;
    BigInteger f3 = BigInteger.ZERO;
    for(int i = 0;; i++) {
      f3 = f1.add(f2);
      count++;
      if(f3.toString().length() == 1000) {
        break;
      }
      f1 = f2;
      f2 = f3;
    }
  System.out.print(count);
  }
  
}