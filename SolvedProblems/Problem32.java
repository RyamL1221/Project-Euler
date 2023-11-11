/*
* 1. Possible numbers:
* a. 1 digit times 4 digit equals 4 digit
* b. 2 digit times 3 digit equals 4 digit
* 2. No repeats
* 3. No zeros
* 4. NEW ANSWER!!!!!!!!
* 5. Answer: 45228. w collab by bb55 and pizza rolls man
*/
import java.util.ArrayList;

class Problem32 {

	public static void main(String[] args) {
		ArrayList<Integer> product = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++)
			for (int j = 1000; j < 10000; j++)
				if (isPandigital(i, j) && product.indexOf(i * j) == -1)
					product.add(i * j);
		for (int i = 10; i < 100; i++)
			for (int j = 100; j < 1000; j++)
				if (isPandigital(i, j) && product.indexOf(i * j) == -1)
					product.add(i * j);
    int sum = 0;
    for(int i: product)
      sum += i;
    System.out.print(sum);
	}

	// I have an idea to optimize this if it runs too slow. go for it. answer is too high
	public static boolean isPandigital(int multiplier, int multiplicand) { 
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int product = multiplier * multiplicand;
		int digit = 0;
		while (multiplier > 0) {
			digit = multiplier % 10;
			if (nums.indexOf(digit) == -1 && digit != 0)
				nums.add(digit);
			else
				return false;
			multiplier /= 10;
		}
		while (multiplicand > 0)  {
			digit = multiplicand % 10;
			if (nums.indexOf(digit) == -1 && digit != 0)
				nums.add(digit);
			else
				return false;
			multiplicand /= 10;
    }
		while (product > 0) {
			digit = product % 10;
			if (nums.indexOf(digit) == -1 && digit != 0)
				nums.add(digit);
			else
				return false;
			product /= 10;
    }
		return true;
		}
}