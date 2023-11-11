public class Problem40 {

	public static void main(String[] args) { //answer: 210
		String champernownes = "";
		int nextNum = 1;
		while (champernownes.length() < 1000000) {
			champernownes += nextNum;
			nextNum++;
		}
		// you dont need to check digit 1 and digit 10. Theyre both 1. i see
		int[] digits = {Integer.parseInt(champernownes.substring(0, 1)), Integer.parseInt(champernownes.substring(9, 10)), Integer.parseInt(champernownes.substring(99, 100)), Integer.parseInt(champernownes.substring(999, 1000)), Integer.parseInt(champernownes.substring(9999, 10000)), Integer.parseInt(champernownes.substring(99999, 100000)), Integer.parseInt(champernownes.substring(999999, 1000000)) };
    int sum = 1;
    for(int e: digits)
			sum *= e;
		System.out.print(sum);
  }
  
}