import java.util.Arrays;

public class Problem49 { //answer: 296962999629

  public static void main(String[] args) {
    String answer = "";
    int val1 = 0;
    int val2 = 0;
    int val3 = 0;
    for(int i = 1488; i <= 3239; i++) {
      val1 = i;
      val2 = i + 3330;
      val3 = val2 + 3330;
      if(CustomMath.isPrime(val1) && CustomMath.isPrime(val2) && CustomMath.isPrime(val3) && isPermutation(val1, val2) && isPermutation(val2, val3)) {
        answer = "" + val1 + val2 + val3;
        System.out.println(answer);
      }
    }
  }

  public static boolean isPermutation(int num1, int num2) {
    int[] digits1 = new int[10];
    int[] digits2 = new int[10];
    while(num1 > 0) {
      digits1[num1 % 10]++;
      num1 /= 10;
    }
    while(num2 > 0) {
      digits2[num2 % 10]++;
      num2 /= 10;
    }
    if(Arrays.equals(digits1, digits2))
      return true;
    else
      return false;
  }
  
}