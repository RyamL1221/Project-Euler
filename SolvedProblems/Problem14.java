class Problem14 {

  public static void main(String[] args) {

    long term = 0l;
    int count = 0;
    int bigCount = 0;
    int bigTerm = 0;
    
    for(int startNum = 0; startNum < 1000000; startNum++) {
      if(startNum % 2 == 0) {
         term = startNum / 2; 
         count++;
      }
      else {
        term = startNum * 3 + 1;
        count++;
      }
      while(term > 1) {
        if(term % 2 == 0) {
          term = term / 2; 
          count++;
        } else {
          term = term * 3 + 1;
          count++;
        }
        
      }

      if(count > bigCount) { 
        bigCount = count;
        bigTerm = startNum;
      }
      
      count = 0;
    }

    System.out.println(bigTerm);
    
  } // signed by byan. answe
  
}