class Problem6 {

	public static void main(String[] args) {
    
    int nSq = 0;
    int nSum = 0;
    int nSuSq = 0;
    int nValue = 0;
    int nDiff = 0;

    while(nValue < 101){

      nSq += nValue * nValue;
      nSum += nValue;
      nValue++;
    }//end while loop

    nSuSq = nSum * nSum;

    nDiff = nSuSq - nSq;

    System.out.println("The difference between the two numbers is " + nDiff);
    
    //heheheha
  } //end main method
}//end class Problem6
//FL Jacob
