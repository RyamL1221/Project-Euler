import java.util.ArrayList;

public class Problem44 { // answer: 5482660

  public static void main(String[] args) {
    int tempSum = 0;
    int tempDiff = 0;
    int d = Integer.MAX_VALUE;
    ArrayList<Integer> pentagonNum = new ArrayList<Integer>();
    for(int i = 1; i < 2500; i++)
      pentagonNum.add(calcPentagonNum(i));
    for(int i = 0; i < pentagonNum.size(); i++) {
      for(int j = i + 1; j < pentagonNum.size(); j++) {
        tempSum = pentagonNum.get(i) + pentagonNum.get(j);
        tempDiff = Math.abs(pentagonNum.get(j) - pentagonNum.get(i));
        if(pentagonNum.contains(tempDiff) && pentagonNum.contains(tempSum))
          if(tempDiff < d)
            d = tempDiff;
      }
    } 

    System.out.println("Answer: " + d);
    
  }

  public static int calcPentagonNum(int n) { 
    return (int) (n * (((3 * n) - 1) / 2.0));
  }
}