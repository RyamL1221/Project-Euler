class Problem30 {
	public static void main(String[] args) { // answer is 443839
    
		int sum = 0;
    for(int i = 2; i < 1000000; i++) {
      if(sumFifthPower(i) == i)
        sum += i; 
    }
    System.out.println(sum);
	}

  public static long sumFifthPower(int a) {
    int sum = 0;
    while(a > 0) {
      sum += Math.pow(a % 10, 5);
      a /= 10;
    }
    return sum;
  }
}