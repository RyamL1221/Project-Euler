class Problem7 {
  
  public static void main(String[] args) {
    int n = 0;
    int var = 2;
    while(n < 10001) {
      if(isPrime(var))
        n++;
      if(n < 10001)
       var++;
    }
    System.out.print(var);
    }

  public static boolean isPrime(int x) {
    for(int i = 2; i <= Math.sqrt(x) ; i++) {
      if(x % i == 0) 
        return(false);
    }
    return(true);
  }
} // Byan