import java.util.ArrayList;

class Problem3B {
	public static void main(String[] args) {
		long theNumber = 600851475143L;
		final double sqrtNumber = Math.sqrt(theNumber);
		// int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };

		ArrayList<Integer> primeList = new ArrayList<Integer>();
		
		for (int nextPrime = 2; nextPrime < sqrtNumber; nextPrime++) {
			if (calcPrime(nextPrime))
				primeList.add(0, nextPrime);
		}
		
		for (int i = 0; i < primeList.size(); i++) {
			if (theNumber % primeList.get(i) == 0) {
				System.out.print(primeList.get(i));
				break;
			}
		}
	}

	public static boolean calcPrime(int x) {
		for (int dividend = 2; dividend <= Math.sqrt(x); dividend++) {
			if (x % dividend == 0) {
				return (false);
			}
		}
		return (true);
	}
}