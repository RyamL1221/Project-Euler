import java.math.BigInteger;

class Problem15 {

  public static void main(String[] args) {

    int[][] coord = new int[20][20];
    
    for(int i = 0; i < 20; i++) //creating a coordinate plane
      for(int j = 0; j < 20; j++) 
        coord[i][j] = 0;

    coord[19][19] = 1; //set all coords except for the bottom right to 0, but right to one to signify that it is the end
    System.out.println(nCr(40, 20)); // n is total amount of the movs you can make for any path and r is the right moves for one path
  } // solved by byan but i had to use internet. answer: 137846528820

 public static BigInteger nCr(int n, int r) {

    BigInteger top = new BigInteger(factorial(n) + "");
    BigInteger rFac = new BigInteger(factorial(r) + "");
    BigInteger nMinusRFac = new BigInteger(factorial(n-r) + "");
    BigInteger bottom = rFac.multiply(nMinusRFac);
    BigInteger answer = top.divide(bottom);
    return(answer);
  }
  
  public static BigInteger factorial(int n) {
    BigInteger answer = new BigInteger(n + ""); 
    for(long i = n - 1; i > 1; i--) 
      answer = answer.multiply(BigInteger.valueOf(i));     
    return(answer);  
  }
}