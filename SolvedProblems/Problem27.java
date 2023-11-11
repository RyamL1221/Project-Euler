class Problem27 {
  
  public static void main(String[] args) { // answer is -59231
    int longestPrime = 0;
    int tempLength = 0;
    int product = 0;
    for(int a = -999; a < 1000; a++) {
      for(int b = -1000; b <= 1000; b++) {
        tempLength = 0;
        for(int n = 0;; n++) {
          if(CustomMath.isPrime(quad(n, a, b)))
            tempLength++;
          else {
            if(tempLength > longestPrime) {
              longestPrime = tempLength;
              product = a * b;
            }
            break;
          } 
          
        }
        tempLength = 0;
				// I still dont get why we need the loop below
        for(int n = 0;; n--) {
          if(CustomMath.isPrime(quad(n, a, b)))
            tempLength++;
          else {
            if(tempLength > longestPrime) {
              longestPrime = tempLength; 
              product = a * b;
            }
            break;
          } 
          
        }
      }
    }
    System.out.print(product);
  }
  

  public static int quad(int n, int a, int b) {
    return((int)(Math.pow(n, 2)) + (a * n) + b);
  }
  
}