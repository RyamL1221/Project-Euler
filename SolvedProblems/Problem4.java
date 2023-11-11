import java.util.ArrayList;
  
class Problem4 {
	public static void main(String[] args) {

		int nHighPal = 0; // Stores highest palindrome
		int nVar1 = 100; //Var 1 to multiply
		int nVar2 = 100; //Var 2 to multiply
		int nProduct = 0;
		int nLargest = 0;
		int[] naPalArr = null;

		while(nVar1 < 1000) {


			while(nVar2 < 1000) {

				nProduct = nVar1 * nVar2;
				naPalArr = intToArray(nProduct);
				if(calcPalindrome(naPalArr)) {
					if(nProduct > nLargest) {
					nLargest = nProduct;
					}
				}
					
					

				nVar2++;
			} // end while(nVar2 < 1000)
			nVar2 = 100;
			nVar1++;
		} // end while(nVar1 < 1000)
		System.out.println("The largest product is " + nLargest);


	}//end 

	public static boolean calcPalindrome(int[] x) {
		if (x[0] == x[x.length - 1] && x[1] == x[x.length - 2] && x[2] == x[x.length - 3])
			return true;
		else
			return false;
	}//end calcPalindrome

	public static int[] intToArray(int z) {
		String zz = Integer.toString(z);
		int[] digits = new int[zz.length()];
		for(int i = 0; i < zz.length(); i++) {
			digits[i] = Integer.parseInt(zz.substring(i, i + 1));
		}
		return digits;
	}//end intToArray
	public static boolean calcPrime(int y) {
		for (int dividend = 2; dividend <= Math.sqrt(y); dividend++) {
			if (y % dividend == 0) {
				return (false);
			}
		}
		return (true);
	}//end calcPrime

}//end class Problem4  - Ryan & Florida Jacob