import java.math.BigInteger;
class Problem25 {
	public static void main(String[] args) {
		BigInteger f1 = BigInteger.ONE;
		BigInteger f2 = BigInteger.ONE;
		BigInteger temp = BigInteger.ZERO;
		int count = 2;

		while (f1.divide(BigInteger.TEN.pow(999)).equals(BigInteger.ZERO)) {
			temp = f1;
			f1 = f1.add(f2);
			f2 = temp; 
			count++;
		}

		System.out.println(count);
	}
}