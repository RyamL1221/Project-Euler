import java.util.*;
import java.math.*;

class Problem24 { //answer is 2783915460.

  public static void main(String[] args) {

    String answer = "";
    int quotient = 0;
    int remainder = 0;
    int lexPos = 1000000 - 1; // number permutation minus 1
    ArrayList<String> numArrList = new ArrayList<String>();
    for(int i = 0; i <= 9; i++)
      numArrList.add(i + "");
    int facNum = 10 - 1; // number of numbers in the permutation minus 1
    while(facNum >= 0) { // factorial number system algorithm (factoradic)
      quotient = lexPos / CustomMath.factorial(facNum);
      remainder = lexPos % CustomMath.factorial(facNum);
      answer += numArrList.get(quotient);
      numArrList.remove(quotient);
      lexPos = remainder;
      facNum--;
    } 
    System.out.print(answer);
  }
  
}