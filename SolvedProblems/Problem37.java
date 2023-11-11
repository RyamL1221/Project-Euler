public class Problem37 {

  public static void main(String[] args) { // answer: 748317
    int sum = 0;
    int numSum = 0; // this should equal 11 at the end
      for(int i = 10; i < 1000000; i++)  {
        if(!CustomMath.isPrime(i))
          continue;
        boolean fromLeftToRight = false;
        boolean fromRightToLeft = false;
        int num = i;
        while(CustomMath.calcNumDigits(num) > 0) { // this could be optimized
          if(CustomMath.isPrime(num) && CustomMath.calcNumDigits(num) == 1) { // infinite loop here
            fromLeftToRight = true;
            break;
          }
          else if(CustomMath.isPrime(num))
            num = truncLeftToRight(CustomMath.getDigits(num));
          else {
            fromLeftToRight = false;
            break;
          }
        }
        if(fromLeftToRight == false)
          continue;
        num = i;
        while(CustomMath.calcNumDigits(num) > 0) { // this can be optimized
          if(CustomMath.isPrime(num) && CustomMath.calcNumDigits(num) == 1) { // infinite loop here
            fromRightToLeft = true;
            break;
          }
          else if(CustomMath.isPrime(num))
            num = truncRightToLeft(CustomMath.getDigits(num));
          else {
            fromRightToLeft = false;
            break;
          }
        }
        if(fromLeftToRight && fromRightToLeft) {
          sum += i;
          numSum++;
        }
      }
    System.out.print(sum);
    System.out.print(" " + numSum);
  }

  public static int truncLeftToRight(int[] digits) {
    int[] truncDigits = new int[digits.length - 1];
    for(int i = 0; i < truncDigits.length; i++) 
      truncDigits[i] = digits[i + 1];
    int concatDigits = CustomMath.concatDigitArr(truncDigits);
    return concatDigits;
  }

  public static int truncRightToLeft(int[] digits) {
    int[] truncDigits = new int[digits.length - 1];
    for(int i = 0; i < truncDigits.length; i ++)
      truncDigits[i] = digits[i];
    int concatDigits = CustomMath.concatDigitArr(truncDigits);
    return concatDigits;
  }
  
}
