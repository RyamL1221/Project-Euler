import java.math.BigDecimal;
import java.math.BigInteger;
class Problem16 {
	public static void main(String[] args) {
		
		BigDecimal theNumBD = new BigDecimal(Math.pow(2, 1000));
		BigInteger theNumBI = theNumBD.toBigInteger();
		String theNumS = theNumBI.toString();
		int[] digits = new int[theNumS.length()];
		int sum = 0;
		
		for (int i = 0; i < theNumS.length(); i++) {
			digits[i] = Integer.parseInt(theNumS.substring(i, i + 1));
		}
		for (int value : digits) {
			sum += value;
		}
		System.out.println(sum);
		
		//System.out.println(theNumS);

		//System.out.println(Math.pow(2, 1000));
		//System.out.println(Math.pow(2, 500) * Math.pow(2, 500));
		
		// convert to string
		// convert digits in string to an array
		// sum all digits in array
	}

	public static int[] doubleToArray(double z) {
		String zz = Double.toString(z);
		int[] digits = new int[zz.length()];
		for(int i = 0; i < zz.length(); i++) {
			digits[i] = Integer.parseInt(zz.substring(i, i + 1));
		}
		return digits;
	} // errors with this method
}