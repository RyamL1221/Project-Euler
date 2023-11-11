import java.util.ArrayList;

public class Problem46 { // answer: 5777

  public static void main(String[] args) {
    int answer = 0;
    ArrayList<Integer> primes = new ArrayList<Integer>();
    boolean canBeWritten = false;
    for(int i = 0; primes.size() < 1000; i++)
      if(CustomMath.isPrime(i))
        primes.add(i);
    for(int i = 3;; i += 2) {
      canBeWritten = false;
      if(CustomMath.isPrime(i))
        continue;
      for(int j = 0; j < primes.size(); j++)
        for(int k = 0; k < 1000; k++) {
            if(primes.get(j) + (2 * Math.pow(k, 2)) == i)
              canBeWritten = true;
        }
      if(!canBeWritten) {
        answer = i;
        break;
      }
    }
    System.out.print(answer);
  }
  
}