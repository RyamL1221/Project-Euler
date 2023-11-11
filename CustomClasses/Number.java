public class Number {
	
	private int value; 
	private boolean isAbundant;
  private boolean isPrime;

	public Number(int v) {
		value = v;
		isAbundant = calcType(v);
	}

  public Number() {
    value = 0;
  }

	public static boolean calcType(int n) {
    if (calcSumPropDiv(n) > n)
      return true; // abundant
		else
			return false; // not abundant
	}

	public boolean getType() {
		return isAbundant;
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

  
	
}