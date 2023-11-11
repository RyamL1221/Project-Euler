class Problem35 {

  public static void main(String[] args) { // answer: 55
    
		int count = 0;
    for(int i = 0; i < 1000000; i++) {
      if(calcCircPrime(i))
        count++;
    }
    System.out.print(count);
    
  }

  public static boolean calcCircPrime(int startNum) {
    if(!CustomMath.isPrime(startNum))
      return false;
    int num = startNum;
    int numDigit = CustomMath.calcNumDigits(startNum);
    int[] digitList = new int[numDigit];
    for(int i = numDigit - 1; num > 0; i--) {
      digitList[i] = num % 10;
      num /= 10;
    }
    int[] circNums = calcCircNums(digitList);
    for(int nums: circNums) {
        if(!CustomMath.isPrime(nums))
          return false;
    }
    return true;
  	// converting int array to string array
		// Brandon: This may be resource intensive working with Strings
		// I think I have another way of being able to conver the numbers in the array to an int
		// Update: I made a method that will convert an array of digits to an int. This way we don't need to use Strings
    // Good job Brandon this definitely helps a lot
  }

	public static int concatDigitArr(int[] nums) {
		int number = 0;
		for (int i = 0; i < nums.length; i++)
			number += nums[i] * Math.pow(10, nums.length - i - 1);
		return number;
	}

  public static int[] calcCircNums(int[] digitList) {
    int[] circNums = new int[digitList.length];
    int length = digitList.length;
    for(int i = 0; i < length; i++) {
      circNums[i] = concatDigitArr(digitList);
      digitList = circDigitList(digitList);
    }
    return circNums;
  }

  public static int[] circDigitList(int[] digitList) {
    int placeHolder = digitList[0];
    for(int i = 0; i < digitList.length - 1; i++) {
      digitList[i] = digitList[i + 1];
    }
    digitList[digitList.length - 1] = placeHolder;
    return digitList;
  }
}