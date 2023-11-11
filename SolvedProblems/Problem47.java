// We may need to make a factor(int x) method. It may be faster since this has a bunch of iterations
import java.util.ArrayList;

public class Problem47 { // answer: 134043

  private static ArrayList<Integer> primes;
  
  public static void main(String[] args) {
    primes = new ArrayList<Integer>();
    for(int i = 0; primes.size() < 700; i++)
      if(CustomMath.isPrime(i))
        primes.add(i);
    for(int i = 0; i < 135000; i++) 
      if(hasFourDistinctPrimeFactors(i) && hasFourDistinctPrimeFactors(i + 1) && hasFourDistinctPrimeFactors(i + 2) && hasFourDistinctPrimeFactors(i + 3))
        System.out.print(i);

  }

  public static boolean hasFourDistinctPrimeFactors(int num) {
    if (primeFactor(num).size() == 4)
			return true;
		return false;
  }

	public static ArrayList<Integer> primeFactor(int x) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
    for(int i = 0; i < primes.size(); i++)
      if(x % primes.get(i) == 0)
        factors.add(primes.get(i));
		return factors;
	}
}