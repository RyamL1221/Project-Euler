import java.util.ArrayList;

/*
Proposed Psuedocode by Brandon:
1. Find sum of all proper divisors for each number under 10000
2. Arrange sums in array where each sum is placed in the index it corresponds to
3. Run a loop on the array to test if it is an amicable pair with the numbers following it 
3a. Take the sum value stored at the first index
3b. Go to the index that is the same number as the sum value (if you can)
3c. Test to make sure that you are going to two different indexes and not the same number (the sum should not equal the index)
3d. If the sum value stored at that second index equals the index of the original item, they are amicable numbers
3e. Repeat for subsequent indexes
4. Add numbers satisfying these conditions to a list as long as they are not already on the list
5. Print the sum of all numbers on this list

Alternatively we could use objects to solve this.
*/
class Problem21 {

	private static int globalSum = 0;

	public static void main(String[] args) { 
		for (int i = 0; i < 10000; i++)
			for (int j = i + 1; j < 10000; j++) 
				if (calcSumPropDiv(i) == j && calcSumPropDiv(j) == i)  // just realized this will count the sums twice
          globalSum += i + j;
		System.out.print(globalSum);
	}

	public static int calcSumPropDiv(int n) {
		int propDiv = 1;
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0) {
				propDiv += i;
				propDiv += (n / i);
			}
		return (propDiv);
	}

}