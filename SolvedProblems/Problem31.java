class Problem31 {

  public static void main(String[] args) { //answer: 73682
    int[] coins = {1, 2, 5, 10, 20, 50, 100, 200};
    System.out.print(calcNumCoins(200, coins.length - 1, coins));
  }

  public static int calcNumCoins(int target, int numElement, int[] set) { // target = target num, numElement = number of coins left to check (to prevent different permutations), set = list of coins 
    if(target == 0)
      return 1;
    if(target < 0 || numElement < 0)
      return 0;
    int num1 = calcNumCoins(target - set[numElement], numElement, set );
    int num2 = calcNumCoins(target, numElement - 1, set);
    return num1 + num2;
  }
}