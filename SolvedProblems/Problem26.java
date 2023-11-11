import java.math.*;
import java.util.*;
import java.util.regex.*;


class Problem26 { //answer is 983

  public static void main(String[] args) {
    BigDecimal numerator = BigDecimal.ONE;
    BigDecimal denominator = BigDecimal.ONE;
    int longest = 0;
    int length = 0;
    while(denominator.compareTo(new BigDecimal("1000")) == -1) {
      length = calcRecDigits(numerator, denominator);
      if(length > longest)
        longest = length;
      denominator = denominator.add(BigDecimal.ONE);
    }
    System.out.print(longest);
  }

  public static int calcRecDigits(BigDecimal numerator, BigDecimal denominator) {
    Pattern p = Pattern.compile("(?>((\\d+?)(\\2{4})))");
    String l = numerator.divide(denominator, 30000, RoundingMode.HALF_UP).toString(); 
    Matcher m = p.matcher(l);
    String answer = "";
    if(m.find()){
      answer = (m.group(2));
    }   
    return(answer.length());
  }

  public static boolean isInfinite(BigDecimal numerator, BigDecimal denominator) {
    BigDecimal quotient = BigDecimal.ONE;
    try{
      quotient = numerator.divide(denominator);
      return false;
    } catch(ArithmeticException e) {
      return true;
    }
  }

  public static String calcFracString(BigDecimal numerator, BigDecimal denominator) {
    return numerator.divide(denominator, 200, RoundingMode.HALF_UP).toString();
  }
    
  
}