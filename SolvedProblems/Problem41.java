public class Problem41 { // answer: 7652413

  public static void main(String[] args) {
    
    int largest = 0;
    for(int i = 0; i < 10000000; i++)
      if(isPandigital(i) && CustomMath.isPrime(i))
        largest = i;
    System.out.print(largest);
 
  }

  public static boolean isPandigital(int a) {
    int originalNumber = a;
    int[] nums = new int[10];
    while(a > 0) {
      nums[(a % 10)]++;
      a /= 10;
    }
    for(int i = 1; i <= CustomMath.calcNumDigits(originalNumber); i++) {
      if(nums[i] != 1) {
        return false;
      }
    } 
    return true;
  }
}