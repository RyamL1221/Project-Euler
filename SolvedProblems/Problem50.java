import java.util.ArrayList;

public class Problem50 { // answer: 997651

  private static ArrayList<Integer> primes;
  
  public static void main(String[] args) {
    int maxSum = Integer.MIN_VALUE;
    primes = new ArrayList<Integer>();
    for(int i = 0; i < 1000000; i++) {
      if(CustomMath.isPrime(i))
        primes.add(i);
    }
    int sum = 0;
      for(int i = 0; i < 4; i++) {
        sum = 0;
        for(int j = i; j < primes.size(); j++) {
          sum += primes.get(j);
          if(sum > maxSum && sum < 1000000 && CustomMath.isPrime(sum))
            maxSum = sum;
      }
        }
    System.out.println(maxSum);
  }
}