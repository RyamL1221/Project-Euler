import java.util.ArrayList;

class Problem3 {

	public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
		final long number = 600851475143L;
		final double sqrtnumber = Math.sqrt((double) number);
    ArrayList<Integer> monkeyDLuffy = new ArrayList<Integer>();
    for(int i = 2; i < sqrtnumber; i ++) {
      if(number % i == 0 && calcPrime(i)) {
        monkeyDLuffy.add(0, i);
      }
    }
    System.out.println(monkeyDLuffy.get(0));
    long endTime   = System.currentTimeMillis();
    long totalTime = endTime - startTime;
    System.out.println(totalTime + " ms");
	}

	public static boolean calcPrime(int x) {
		for (int dividend1 = 2; dividend1 <= Math.sqrt(x); dividend1++) {
			if (x % dividend1 == 0) {
				return (false);
			}
		}
		return (true);
	}
} 