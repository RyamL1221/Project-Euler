import java.util.Arrays;

public class Problem52 { // Answer: 142857
  public static void main(String[] args) {
    for(int i = 1; i < 10000000; i++)
      if(hasSameDigits(i, i * 2) && hasSameDigits(i, i * 3) && hasSameDigits(i, i * 4) && hasSameDigits(i, i * 5) && hasSameDigits(i, i * 6)) {
        System.out.println(i);
        break;
      }
  }
  public static boolean hasSameDigits(int num1, int num2) {
    
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