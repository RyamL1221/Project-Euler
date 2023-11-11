class Problem12 {

  public static void main(String[] args) {
    int num = 0;
    boolean condition = true;
    for(int i = 1; condition == true ; i++) {
      if(numDiv(calcTri(i)) > 500) {
        num = calcTri(i);
        condition = false;
      }       
    }
    System.out.println(num);
  } // finished by byan :D 

  public static int calcTri(int n) { // calculates nth triangle number
    int num = 0;
    for(int i = 1; i <= n; i++)
      num += i;
    return(num);
    
  }

  public static int numDiv(int n) { // calculates number of divisors for a number n
    int numDiv = 0;
    for(int i = 1; i <= Math.sqrt(n); i++) {
      if(n % i == 0)
        if(i == Math.sqrt(n))
          numDiv += 1;
        else 
          numDiv += 2;
    }
    return(numDiv);
  }
  
}