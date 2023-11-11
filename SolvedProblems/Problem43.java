public class Problem43 {

  public static void main(String[] args) { // answer: 16695334890
    long sum = 0L;
    for(long i = 1000000000L; i < 10000000000L; i++) {
      if(isZeroToNinePandigital(i))
        if(hasProperty(i))
          sum += i;
    }
    System.out.print(sum);
  }

  public static boolean isZeroToNinePandigital(long n) {
    if(CustomMath.calcNumDigits(n) != 10)
      throw new NumberLengthException("Number inputted is not ten digits");
    int[] digits = new int[10];
    while(n > 0) {
      digits[(int) (n % 10)]++;
      n /= 10;
    }
    for(int digit: digits)
      if(digit != 1)
        return false;
    return true;
  }

  public static String removeLeadingZero(String num) {
    while(true) {
      if(num.substring(0, 1).equals("0"))
        num = num.substring(1);
      else
        return num; 
    }
  }

  public static boolean hasProperty(long num) {
    String numString = num + "";
    if(Integer.parseInt(numString.substring(1,4)) % 2 != 0)
      return false;
    if(Integer.parseInt(numString.substring(2,5)) % 3 != 0)
      return false;
    if(Integer.parseInt(numString.substring(3,6)) % 5 != 0)
      return false;
    if(Integer.parseInt(numString.substring(4,7)) % 7 != 0)
      return false;
    if(Integer.parseInt(numString.substring(5,8)) % 11 != 0)
      return false;
    if(Integer.parseInt(numString.substring(6,9)) % 13 != 0)
      return false;
    if(Integer.parseInt(numString.substring(7,10)) % 17 != 0)
      return false;
    return true;
    
  }
}