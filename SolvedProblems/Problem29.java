import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.BigInteger;

class Problem29 {
// ANSWER: 9183
  public static void main(String[] args) {
    ArrayList<BigInteger> bigIntList = new ArrayList<BigInteger>();
		int distinctPowers = 0;
		for(int a = 2; a <= 100; a++) 
      for(int b = 2; b <= 100; b++) {
				BigDecimal decNum = new BigDecimal(Math.pow(a, b));
				BigInteger num = decNum.toBigInteger();
				addNumToList(bigIntList, num);
			}
		for(BigInteger value : bigIntList)
			distinctPowers++;
		System.out.println(distinctPowers);
  }
  public static boolean addNumToList(ArrayList<BigInteger> elements, BigInteger target) {
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
}