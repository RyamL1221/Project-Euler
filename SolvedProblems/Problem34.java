import java.util.ArrayList;

class Problem34 { // answer: 40730

  public static void main(String[] args) {
    int totalSum = 0;;
    ArrayList<Integer> sumList = new ArrayList<Integer>();
    for(int i = 10; i < 100000; i++)  // start at two digits 
      if(isDigFac(i))
        sumList.add(i);
    for(int num: sumList)
      totalSum += num;
    System.out.print(totalSum);
    
  }

  public static boolean isDigFac(int num) {
    int num1 = num;
    int digit = 0;
    int sum = 0;
    while(num > 0) {
      digit = num % 10;
      sum += CustomMath.factorial(digit);
      num /= 10;
    }
    if(sum == num1) 
      return true;
    else 
      return false;
  }
}