class Problem6B {
  
  public static void main(String[] args) {
    
    int sumSquare = 0;
    int sumInt = 0;
    for(int i = 1; i <= 100; i++) {
      sumInt += i;
      sumSquare += Math.pow(i, 2);
    }

    sumInt *= sumInt;
    System.out.println(sumInt - sumSquare);
  }
  
} // Ryan