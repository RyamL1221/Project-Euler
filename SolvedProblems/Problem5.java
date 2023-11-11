class Problem5 {

	public static void main(String[] args) {
		int nNumber = 2520;
    boolean isDivisible = false;
    do{
      if( (nNumber%11 + nNumber%12 + nNumber%13 + nNumber%14 + nNumber%15 + nNumber%16 + nNumber%17 + nNumber%18 + nNumber%19 + nNumber%20) == 0 ){
        System.out.println("The LCD is " + nNumber);
        isDivisible = true;
      }//end if
      else
        nNumber++;
      
    } while(!isDivisible); //end do while
    
  
  } //end main method
}//end class Problem5A 
//FL Jacob