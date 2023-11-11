// ANSWER: 1739023853137
// COME BACK TO OPTIMIZE
// POTENTIAL OPTIMIZATIONS:
// Divisors both even or both odd?
// Square numbers?
// Numbers ending in an odd digit?
// Make list of all prime numbers first and compare numbers to this list

import java.util.ArrayList;
class Problem357 {
	public static void main(String[] args) {
		long total = 3L;

		for (int num = 3; num <= 100000000; num++) {
			if (!isPrime(num + 1)) {
				continue;
			}
			ArrayList<Integer> divisorList = getDivisors(num);
			if (checkDivList(divisorList, num)) {
				total += num;
			}
			if (num % 50000 == 0) {
				System.out.println(num);
			}
		}
		System.out.println(total);

		/* for (int num = 1; num <= 1000; num++) {
			ArrayList<Integer> divisorList = getDivisors(num);
			if (checkDivList(divisorList, num)) {
				System.out.println(num);
			}
		} */
	}

	public static boolean isPrime(int x) {
    for(int i = 2; i <= Math.sqrt(x); i++)
      if(x % i == 0)
        return(false);
    return(true);
  }

	// try checking divisors (even/odd) in this function and make it return a boolean instead
	public static ArrayList<Integer> getDivisors(int x) {
		ArrayList<Integer> divList = new ArrayList<Integer>();
		for (int i = 1; i <= Math.sqrt(x); i++) {
			if (x % i == 0) {
				divList.add(i);
				divList.add(x / i);
			}
		}
		return divList;
	}

	public static boolean checkDivList(ArrayList<Integer> divList, int num) {
		for (int index = 0; index < divList.size(); index += 2) {
			int d = divList.get(index);
			if (!isPrime(num / d + d)) {
				return false;
			}
		}
		return true;
	}
}