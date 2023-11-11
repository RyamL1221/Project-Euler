import java.math.*;
import java.util.*;
public class Problem36 {

  public static void main(String[] args) { // answer: 872187
    int sum = 0;
    for(int i = 0; i < 1000000; i++) {
      if(CustomMath.isPalindrome(i) && CustomMath.isPalindrome(CustomMath.convertDecimalToBinary(i)))
        sum += i;
    }
    System.out.print(sum);
    /* BigInteger test = BigInteger.TEN.add(BigInteger.TEN); // yoooo its this guy!!!!!!!!
		byte[] binaryTest = test.toByteArray(); // Just doing some tests. this method doesnt return binary, it returns it in bytes which is like base 128
		for (byte num : binaryTest)
			System.out.print(num + ", "); */
		// int sum = 0;
    /* for(int i = 1; i < 1000000; i++) {
      if(CustomMath.isPalindrome(i) && CustomMath.isPalindrome(CustomMath.convertDecimalToBinary(i)))
        sum += i;
    }
    */
    //System.out.print(sum);
    /* for(int i = 0; i < 1000; i++) {
     // System.out.println("Num: " + i + " Bin: " + CustomMath.convertDecimalToBinary(i) + " Palin: " + CustomMath.isPalindrome(i) + " Bin Palin: " + CustomMath.isPalindrome(CustomMath.convertDecimalToBinary(i)));
    } */ // my decimal to binary method works/ just gotta work on the palindrome method
  } // yeah it looks good. just gotta work on the isPalindrome methods
} // isPalindrome might need some more work. which one? there are two methods
// i found the issue