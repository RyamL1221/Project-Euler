
class Problem28 {

  public static void main(String[] args) { // answer is 669171001

    long num = 1L;
    long base = 1L;
    long totalSum = 0L;
    for(int i = 0; i <= 500; i++) { // to top right
      totalSum += (long) Math.pow(base, 2);
      base += 2L;
    }
    base = 2L;
    for(int i = 0; i <= 500; i++) { // to bottom right
      totalSum += num;
      num += base;
      base += 8L;
    }
    base = 6L;
    num = 1L;
    for(int i = 0; i <= 500; i++) { // to top left
      totalSum += num;
      num += base;
      base += 8L;
    }
    num = 1L;
    base = 4L;
    for(int i = 0; i <= 500; i++) { // to bottom left
      totalSum += num;
      num += base;
      base += 8L;
    }
    totalSum -= 3L; // one is counting in the calculations four total times
    System.out.print(totalSum);
  }
  
}