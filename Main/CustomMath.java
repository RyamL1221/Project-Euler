import java.math.*;
import java.util.*;

public class CustomMath {

  public static int factorial(int n) {
    if (n == 0)
        return 1;
    else
        return n * factorial(n-1);
  }

   public static BigInteger factorial(BigInteger n) { 
    if(n.equals(BigInteger.ONE)) //base case
      return(BigInteger.ONE);
    else // general case
      return(n.multiply(factorial(n.subtract(BigInteger.ONE)))); //recursive
  }

  public static boolean isPrime(int x) {
    if(x <= 1) 
      return false;
    for(int i = 2; i <= Math.sqrt(x); i++)
      if(x % i == 0)
        return(false);
    return(true);
  }
    public static boolean isPrime(long x) {
    if(x <= 1) 
      return false;
    for(int i = 2; i <= Math.sqrt(x); i++)
      if(x % i == 0)
        return(false);
    return(true);
  }

	public static int gcf(int x, int y) {
		int gcf = Math.min(x, y);
		if (x % gcf == 0 && y % gcf == 0)
			return gcf;
		else
			gcf /= 2;
		while (gcf > 0) {
			if (x % gcf == 0 && y % gcf == 0)
				return gcf;
			else
				gcf--;
		}
		return -1;
	}

   public static boolean isInArray(ArrayList<BigInteger> elements, BigInteger target) {
		int left = 0;
		int right = elements.size() - 1;

		while (left <= right) {
			int middle = (left + right) / 2;
			if (target.compareTo(elements.get(middle)) < 0) {
				right = middle - 1;
			}
			else if (target.compareTo(elements.get(middle)) > 0) {
				left = middle + 1;
			}
			else {
				return false;
			}
		}
		elements.add(left, target);
		return true;
	}

  public static int calcNumDigits(int num) {
    int count = 0;
    while(num > 0) {
      count++;
      num /= 10;
    }
    return count;
  }

  public static int calcNumDigits(long num) {
    int count = 0;
    while(num > 0) {
      count++;
      num /= 10;
    }
    return count;
  }

  public static String convertBinaryToOctal(String binaryNumber) {
    String octalNumber = "";
    for(int i = 0; i < binaryNumber.length();) {
      System.out.println("Binary Number length: " + binaryNumber.length());
      if(i + 3 <= binaryNumber.length()) {
        octalNumber = (Integer.parseInt(binaryNumber.substring(binaryNumber.length() - 3 - i, binaryNumber.length() - i), 2)) + octalNumber;
        i += 3;
        System.out.println("Octal: " + octalNumber);
      }
      else if(i + 2 <= binaryNumber.length()) {
        octalNumber = (Integer.parseInt(binaryNumber.substring(binaryNumber.length() - 2 - i, binaryNumber.length() - i), 2)) + octalNumber;
        i += 2;
      }
      else if(i + 1 <= binaryNumber.length()) {
        octalNumber = binaryNumber.substring(binaryNumber.length() - 1 - i, binaryNumber.length() - i) + octalNumber;
        i++;
      }
      System.out.println(i);
    }
    return octalNumber;
  }
  public static BigInteger convertDecimalToBinary(int num) { // works
    if(num == 1) 
      return BigInteger.ONE;
    BigInteger binNum = BigInteger.ZERO;
    int i = 0;
    while(num > 0) {
      while(Math.pow(2, i) < num)
        i++;
      if(num == Math.pow(2, i))
        return binNum.add(new BigDecimal(Math.pow(10, i)).toBigInteger());
      else {
        binNum = binNum.add(new BigDecimal(Math.pow(10, i - 1)).toBigInteger());
        num -= Math.pow(2, i - 1);
        i = 0;
      }
    }
    return binNum;
  }

  public static boolean isBinaryNumber(String binNum) {
    for(int i = 0; i < binNum.length(); i++) 
      if(!(binNum.substring(i, i + 1).equals("0") || binNum.substring(i, i + 1).equals("1")))
        return false;
    return true;
  }
  
  public static int[] getDigits(int a) {
    ArrayList<Integer> digitList = new ArrayList<Integer>();
    int[] digitIntList = new int[calcNumDigits(a)];
    while(a > 0) {
      digitList.add(a % 10);
      a /= 10;
    }
    int i = 0;
    Collections.reverse(digitList);
    for(int digit: digitList) {
      digitIntList[i] = digit;
      i++;
    }
    return digitIntList;
  }
  
  public static boolean isPalindrome(int a) {
    int[] numDigits = getDigits(a);
    for(int i = 0; i < numDigits.length / 2; i++) {
      if(numDigits[i] != numDigits[numDigits.length - 1 - i])
        return false;
    }
    return true;
  }
  public static boolean isPalindrome(BigInteger a) {
    String num = a.toString();
    int[] numDigits = new int[num.length()];
    for(int i = 0; i < numDigits.length; i++) {
      numDigits[i] = Integer.parseInt(num.substring(i, i + 1));
    }
    for(int i = 0; i < numDigits.length / 2; i++) {
      if(numDigits[i] != numDigits[numDigits.length - 1 - i])
        return false;
    }
    return true;
  }

  public static int concatDigitArr(int[] nums) {
		int number = 0;
		for (int i = 0; i < nums.length; i++)
			number += nums[i] * Math.pow(10, nums.length - i - 1);
		return number;
	}
  
  public static String decimalToNumberBase(int num, int base) { // does not work
      String numString = "";
      char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
      while(num > 0) {
          numString = digits[num % base] + numString;
          num /= base;           
        }
      return numString;
    }
    
  public static int numberBaseToDecimal(String start, int base) {
      String digits = "0123456789ABCDEF";
      start = start.toUpperCase();
      int decimal = 0;
      for(int i = 0; i < start.length(); i++) 
          decimal = base * decimal + digits.indexOf(start.charAt(i));
      return decimal;       
    }

  public static boolean isRightTriangle(int s1, int s2, int s3) {
    ArrayList<Integer> sidesList = new ArrayList<Integer>();
    sidesList.add(s1);
    sidesList.add(s2);
    sidesList.add(s3);
    Collections.sort(sidesList);
    if(Math.pow(sidesList.get(0), 2) + Math.pow(sidesList.get(1), 2) == Math.pow(sidesList.get(2), 2))
      return true;
    else
      return false;
  }

   public static int recursiveBinarySearch(int[] array, int start, int end, int target)
  {
      int middle = (start + end)/2;
      // base case: check middle element
      if (target == array[middle]) {
          return middle;
      }
      // base case: check if we've run out of elements
      if(end < start){
          return -1; // not found
      }
      // recursive call: search start to middle
      if (target < array[middle]){
          return recursiveBinarySearch(array, start, middle - 1, target);
      }
      // recursive call: search middle to end
      if (target > array[middle]){
          return recursiveBinarySearch(array, middle + 1, end, target);
      }
      return -1;
  }

  public static boolean isFactor(int num, int divisor) {
    if(num % divisor == 0)
      return true;
    else
      return false;
  }

  
}