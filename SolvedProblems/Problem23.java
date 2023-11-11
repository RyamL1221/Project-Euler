import java.util.ArrayList;

// Answer: 4179871
class Problem23 {

	public static void main(String[] args) {
		int sum = 0;
		int allNumSum = 0;
		ArrayList<Integer> abunNum = new ArrayList<Integer>();
		ArrayList<Integer> abunSum = new ArrayList<Integer>();

		for (int i = 1; i <= 28123; i++) {
			allNumSum += i;
			if (calcType(i)) // i made a static and non static calc type
				abunNum.add(i);
		}

		//System.out.println(abunNum);

		for (int i = 0; i < abunNum.size() - 1; i++) {
			for (int j = i; j < abunNum.size(); j++) {
				int ij_Sum = abunNum.get(i) + abunNum.get(j);
				addNumToList(abunSum, ij_Sum);
			}
		}

		System.out.println(abunSum);
		
		// find the sum of abunSum
		for (Integer num : abunSum)
			sum += num;
		
		// do allNumSum - (sum of abunSum) and print it
		System.out.println(allNumSum - sum);
	}

	public static int calcSumPropDiv(int n) {
    int a = 1;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        if (i != Math.sqrt(n)) {
          a += i;
          a += n / i;
        } else
          a += i; // e dot dash brandon bot
      }
    }
    return a;
  }
	
	public static boolean calcType(int n) {
    if (calcSumPropDiv(n) > n)
      return true; // abundant
		else
			return false; // not abundant
	}
	
	public static boolean addNumToList(ArrayList<Integer> elements, int target) {
		int left = 0;
		int right = elements.size() - 1;

		if (target > 28123)
			return false;

		while (left <= right) {
			int middle = (left + right) / 2;
			if (target < elements.get(middle)) {
				right = middle - 1;
			}
			else if (target > elements.get(middle)) {
				left = middle + 1;
			}
			else {
				return false;
			}
		}
		elements.add(left, target);
		return true;
	}
}